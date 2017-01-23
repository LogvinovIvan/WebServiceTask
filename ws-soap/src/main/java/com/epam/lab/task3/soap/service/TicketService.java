package com.epam.lab.task3.soap.service;

import com.epam.lab.ticket.manager.entity.Ticket;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by Ivan_Lohvinau on 1/23/2017.
 */
@WebService(name = "TicketService")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT,use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface TicketService {
    @WebMethod(operationName = "getTicketById")
     Ticket getTicket(Long id);
}
