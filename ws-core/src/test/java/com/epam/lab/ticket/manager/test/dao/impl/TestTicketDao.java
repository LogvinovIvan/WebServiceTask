package com.epam.lab.ticket.manager.test.dao.impl;

import com.epam.lab.ticket.manager.dao.TicketDao;
import com.epam.lab.ticket.manager.entity.Person;
import com.epam.lab.ticket.manager.entity.StateTicket;
import com.epam.lab.ticket.manager.entity.Ticket;
import com.epam.lab.ticket.manager.exception.DaoException;
import com.epam.lab.ticket.manager.test.dao.config.TestAppConfig;
import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DatabaseTearDown;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestAppConfig.class, loader = AnnotationConfigContextLoader.class)
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        TransactionalTestExecutionListener.class,
        DbUnitTestExecutionListener.class})
@DbUnitConfiguration(databaseConnection = {"testConnection"})
@Transactional
@DatabaseSetup(value = "classpath:dao-data/init-data.xml")
@DatabaseTearDown(value = "classpath:dao-data/init-data.xml",
        type = DatabaseOperation.DELETE_ALL)
public class TestTicketDao {

    @Autowired
    private TicketDao dao;

    @Test
    public void updateStatusOfTicketTest() throws DaoException {
        Long idTicket = 2l;
        assertTrue(dao.updateStatusOfTicket(2l));
    }

    @Test
    public void getByIdTest() throws DaoException {
        Long idTicket = 2l;
        Ticket emptyTicket = new Ticket();
        Ticket ticket = dao.getById(idTicket);
        assertNotEquals(emptyTicket, ticket);
    }

    @Test
    public void addTest() throws DaoException {
        Person person = new Person();
        person.setId(1l);

        Ticket ticket = new Ticket();
        ticket.setDepartureCity("Brest");
        ticket.setArrivalCity("Moscow");
        ticket.setDepartureTime(new Date());
        ticket.setArrivalTime(new Date());
        ticket.setState(StateTicket.BOOKED);
        ticket.setCost(200);
        ticket.setPerson(person);

        assertNotNull(dao.add(ticket));
    }

    @Test
    public void deleteTest() throws DaoException {
        Long idTicket = 1l;
        assertTrue(dao.delete(idTicket));
    }
}
