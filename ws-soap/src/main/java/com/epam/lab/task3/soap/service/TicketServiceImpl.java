package com.epam.lab.task3.soap.service;

import com.epam.lab.ticket.manager.entity.Ticket;

import javax.jws.WebService;


/**
 * Created by Ivan_Lohvinau on 1/23/2017.
 */
@WebService(endpointInterface = "com.epam.lab.task3.soap.service.TicketService")
public class TicketServiceImpl implements TicketService {
    @Override
    public Ticket getTicket(Long id) {
        Ticket ticket = new Ticket();
        ticket.setNumberTicket(id);
        ticket.setArrivalCity("AAAA");
        return ticket;
    }
}
