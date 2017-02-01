package com.epam.lab.task3.test.client;






import com.epam.lab.task3.soap.service.Ticket;
import com.epam.lab.task3.soap.service.TicketService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class SoapTestClient {



    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8085/ticket");
        QName qname = new QName("http://service.soap.task3.lab.epam.com/", "TicketServiceImplService");

        Service service = Service.create(url, qname);

        TicketService ticketService = service.getPort(TicketService.class);
        Long numberTicket=2L;
        Ticket ticket = ticketService.getTicketById(numberTicket);
        System.out.println(ticket.toString());
    }

}
