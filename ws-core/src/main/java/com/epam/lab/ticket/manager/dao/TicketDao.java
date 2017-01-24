package com.epam.lab.ticket.manager.dao;

import com.epam.lab.ticket.manager.entity.Ticket;
import com.epam.lab.ticket.manager.exception.DaoException;


public interface TicketDao extends Dao<Ticket,Long> {
    boolean updateStatusOfTicket(Long idTicket) throws DaoException;
}
