package com.epam.lab.ticket.manager.service.impl;

import com.epam.lab.ticket.manager.dao.TicketDao;
import com.epam.lab.ticket.manager.entity.Ticket;
import com.epam.lab.ticket.manager.exception.DaoException;
import com.epam.lab.ticket.manager.exception.ServiceException;
import com.epam.lab.ticket.manager.service.TicketService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service(value = "TicketService")
@Transactional
public class TicketServiceImpl implements TicketService {

    private static final Logger logger = LogManager.getLogger(TicketServiceImpl.class);

    @Autowired
    private TicketDao dao;

    @Override
    public Long bookTicket(Ticket ticket) throws ServiceException {
        try {
            return dao.add(ticket);
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public Ticket searchTicketById(Long idTicket) {
        Ticket ticket;
        try {
            ticket = dao.getById(idTicket);
        } catch (DaoException e) {
            logger.warn("Ticket with id=" + idTicket.toString() + " not found", e);
            ticket = new Ticket();
        }
        return ticket;
    }

    @Override
    public boolean payForTheTicket(Long id) {
        boolean result;
        try {
            dao.updateStatusOfTicket(id);
            result = true;
        } catch (DaoException e) {
            logger.error("Error update status of ticket with id = " + id.toString(), e);
            result = false;
        }
        return result;
    }

    @Override
    public boolean returnTicketToSystem(Long idTicket) {
        boolean result;
        try {
            result = dao.delete(idTicket);
        } catch (DaoException e) {
            logger.error("Error to delete ticket with id=" + idTicket.toString() + " from system");
            result = false;
        }
        return result;
    }

    public void setDao(TicketDao dao) {
        this.dao = dao;
    }
}
