package com.epam.lab.ticket.manager.service;

import com.epam.lab.ticket.manager.entity.Person;
import com.epam.lab.ticket.manager.entity.Ticket;

/**
 * Created by Ivan_Lohvinau on 1/23/2017.
 */
public interface TicketService {
    Long bookTicket(Ticket ticket);
}
