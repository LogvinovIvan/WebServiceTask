
package com.epam.lab.task3.soap.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TicketServiceImplService", targetNamespace = "http://service.soap.task3.lab.epam.com/", wsdlLocation = "http://localhost:8085/ticket?wsdl")
public class TicketServiceImplService
    extends Service
{

    private final static URL TICKETSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException TICKETSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName TICKETSERVICEIMPLSERVICE_QNAME = new QName("http://service.soap.task3.lab.epam.com/", "TicketServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8085/ticket?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TICKETSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        TICKETSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public TicketServiceImplService() {
        super(__getWsdlLocation(), TICKETSERVICEIMPLSERVICE_QNAME);
    }

    public TicketServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TICKETSERVICEIMPLSERVICE_QNAME, features);
    }

    public TicketServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, TICKETSERVICEIMPLSERVICE_QNAME);
    }

    public TicketServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TICKETSERVICEIMPLSERVICE_QNAME, features);
    }

    public TicketServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TicketServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TicketService
     */
    @WebEndpoint(name = "TicketServiceImplPort")
    public TicketService getTicketServiceImplPort() {
        return super.getPort(new QName("http://service.soap.task3.lab.epam.com/", "TicketServiceImplPort"), TicketService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TicketService
     */
    @WebEndpoint(name = "TicketServiceImplPort")
    public TicketService getTicketServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.soap.task3.lab.epam.com/", "TicketServiceImplPort"), TicketService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TICKETSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw TICKETSERVICEIMPLSERVICE_EXCEPTION;
        }
        return TICKETSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
