package com.epam.lab.ticket.manager.service;

import com.epam.lab.ticket.manager.entity.Person;
import com.epam.lab.ticket.manager.entity.Ticket;
import com.epam.lab.ticket.manager.exception.ServiceException;

/**
 * Created by Ivan_Lohvinau on 1/23/2017.
 */
public interface TicketService {
    Long bookTicket(Ticket ticket) throws ServiceException;
    Ticket searchTicketById(Long idTicket);
    boolean payForTheTicket(Long id);
    boolean returnTicketToSystem(Long idTicket);
}
