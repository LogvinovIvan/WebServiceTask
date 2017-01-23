package com.epam.lab.ticket.manager.dao.impl.hibernate;

import com.epam.lab.ticket.manager.dao.TicketDao;
import com.epam.lab.ticket.manager.entity.Ticket;
import com.epam.lab.ticket.manager.exception.DaoException;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class HibernateTicketDao implements TicketDao {

    @Autowired
    private SessionFactory factory;

    @Override
    public boolean payForTicket(Ticket ticket) throws DaoException {
        Session session = factory.getCurrentSession();
        try {
            session.saveOrUpdate(ticket);
        } catch (HibernateException e) {
            throw new DaoException(e);
        }
        return true;
    }

    @Override
    public Ticket getById(Long key) throws DaoException {
        Session session = factory.getCurrentSession();
        Ticket ticket;
        try {
            ticket = (Ticket) session.get(Ticket.class, key);
        } catch (HibernateException e) {
            throw new DaoException(e);
        }
        return ticket;
    }

    @Override
    public Long add(Ticket ticket) throws DaoException {
        Session session = factory.getCurrentSession();
        Long numberTicket;
        try {
            numberTicket = (Long) session.save(ticket);
        } catch (HibernateException e) {
            throw new DaoException(e);
        }
        return numberTicket;
    }

    @Override
    public boolean delete(Long key) throws DaoException {
        try {
            Session session = factory.getCurrentSession();
            Ticket ticket = new Ticket();
            ticket.setNumberTicket(key);
            session.delete(ticket);
        } catch (HibernateException e) {
            throw new DaoException("Error delete ticket with id = " + key, e);
        }
        return true;
    }

    @Autowired
    public void setFactory(SessionFactory factory) {
        this.factory = factory;
    }
}
