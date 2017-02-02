package com.epam.lab.task3.rest.json.service;

import com.epam.lab.ticket.manager.entity.Person;
import com.epam.lab.ticket.manager.entity.Ticket;
import com.epam.lab.ticket.manager.exception.ServiceException;
import com.epam.lab.ticket.manager.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/tickets/json")
@Controller
public class JsonRestTicketService {

    @Autowired
    private TicketService service;

    @GET
    @Path(value = "/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Ticket getTicketById(@PathParam("id") Long id) {
        Ticket ticket = service.searchTicketById(id);
        return ticket;
    }

    @PUT
    @Path(value = "/{id}/pay")
    public Response payForTheTicket(@PathParam("id") Long id) {
        Response response;
        if (service.payForTheTicket(id)) {
            response = Response.status(Response.Status.OK).build();
        } else {
            response = Response.status(Response.Status.NOT_MODIFIED).build();
        }
        return response;
    }

    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response bookTicket(Ticket ticket) {
        Response response;

        Long idBookedTicket = null;
        try {
            idBookedTicket = service.bookTicket(ticket);
            String result = "idTicket:" + idBookedTicket.toString();
            response = Response.status(Response.Status.CREATED).entity(result).build();
        } catch (ServiceException e) {
            response = Response.status(Response.Status.NOT_MODIFIED).build();
        }

        return response;
    }

    @DELETE
    @Path("/delete/{id}")
    public Response removeTicketFromSystem(@PathParam("id") Long id) {
        Response response;
        if (service.returnTicketToSystem(id)) {
            response = Response.status(Response.Status.OK).build();
        } else {
            response = Response.status(Response.Status.NOT_MODIFIED).build();
        }
        return response;
    }

    @Autowired
    public void setService(TicketService service) {
        this.service = service;
    }
}
