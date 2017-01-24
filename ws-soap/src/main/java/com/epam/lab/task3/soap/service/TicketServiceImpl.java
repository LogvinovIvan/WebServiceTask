package com.epam.lab.task3.soap.service;

import com.epam.lab.ticket.manager.entity.Ticket;
import com.epam.lab.ticket.manager.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoader;

import javax.jws.WebService;


/**
 * Created by Ivan_Lohvinau on 1/23/2017.
 */
@WebService(endpointInterface = "com.epam.lab.task3.soap.service.TicketService", name = "TicketServiceImpl_")
@Component
public class TicketServiceImpl implements TicketService {


    @Autowired
    private com.epam.lab.ticket.manager.service.TicketService service;

    @Override
    public Ticket getTicket(Long id) {
       return service.searchTicketById(id);
    }

    @Override
    public Long bookTicket(Ticket ticket) {
        Long numberOfTicket = null;
        try {
            numberOfTicket = service.bookTicket(ticket);
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        return numberOfTicket;
    }

    @Override
    public boolean returnTicket(Long idTicket) {
        return service.returnTicketToSystem(idTicket);
    }

    @Override
    public boolean payForTheTicket(Long idTicket) {
        return service.payForTheTicket(idTicket);
    }
}
