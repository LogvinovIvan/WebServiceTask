package com.epam.lab.task3.soap.service;


import com.epam.lab.ticket.manager.config.ApplicationConfig;
import com.epam.lab.ticket.manager.entity.Ticket;
import com.epam.lab.ticket.manager.exception.ServiceException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.jws.WebService;



@WebService(endpointInterface = "com.epam.lab.task3.soap.service.TicketService", name = "TicketServiceImpl")
public class TicketServiceImpl implements TicketService {

    private com.epam.lab.ticket.manager.service.TicketService service = new AnnotationConfigApplicationContext(ApplicationConfig.class).getBean(com.epam.lab.ticket.manager.service.TicketService.class);

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

    public void setService(com.epam.lab.ticket.manager.service.TicketService service) {
        this.service = service;
    }
}
