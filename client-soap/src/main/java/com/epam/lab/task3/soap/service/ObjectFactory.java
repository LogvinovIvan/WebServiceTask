
package com.epam.lab.task3.soap.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epam.lab.task3.soap.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReturnTicketResponse_QNAME = new QName("http://service.soap.task3.lab.epam.com/", "returnTicketResponse");
    private final static QName _GetTicketById_QNAME = new QName("http://service.soap.task3.lab.epam.com/", "getTicketById");
    private final static QName _PayForTheTicketResponse_QNAME = new QName("http://service.soap.task3.lab.epam.com/", "payForTheTicketResponse");
    private final static QName _BookTicket_QNAME = new QName("http://service.soap.task3.lab.epam.com/", "bookTicket");
    private final static QName _GetTicketByIdResponse_QNAME = new QName("http://service.soap.task3.lab.epam.com/", "getTicketByIdResponse");
    private final static QName _Person_QNAME = new QName("http://service.soap.task3.lab.epam.com/", "person");
    private final static QName _PayForTheTicket_QNAME = new QName("http://service.soap.task3.lab.epam.com/", "payForTheTicket");
    private final static QName _Ticket_QNAME = new QName("http://service.soap.task3.lab.epam.com/", "ticket");
    private final static QName _ReturnTicket_QNAME = new QName("http://service.soap.task3.lab.epam.com/", "returnTicket");
    private final static QName _BookTicketResponse_QNAME = new QName("http://service.soap.task3.lab.epam.com/", "bookTicketResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epam.lab.task3.soap.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTicketById }
     * 
     */
    public GetTicketById createGetTicketById() {
        return new GetTicketById();
    }

    /**
     * Create an instance of {@link PayForTheTicketResponse }
     * 
     */
    public PayForTheTicketResponse createPayForTheTicketResponse() {
        return new PayForTheTicketResponse();
    }

    /**
     * Create an instance of {@link ReturnTicketResponse }
     * 
     */
    public ReturnTicketResponse createReturnTicketResponse() {
        return new ReturnTicketResponse();
    }

    /**
     * Create an instance of {@link PayForTheTicket }
     * 
     */
    public PayForTheTicket createPayForTheTicket() {
        return new PayForTheTicket();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link BookTicket }
     * 
     */
    public BookTicket createBookTicket() {
        return new BookTicket();
    }

    /**
     * Create an instance of {@link GetTicketByIdResponse }
     * 
     */
    public GetTicketByIdResponse createGetTicketByIdResponse() {
        return new GetTicketByIdResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link ReturnTicket }
     * 
     */
    public ReturnTicket createReturnTicket() {
        return new ReturnTicket();
    }

    /**
     * Create an instance of {@link BookTicketResponse }
     * 
     */
    public BookTicketResponse createBookTicketResponse() {
        return new BookTicketResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.task3.lab.epam.com/", name = "returnTicketResponse")
    public JAXBElement<ReturnTicketResponse> createReturnTicketResponse(ReturnTicketResponse value) {
        return new JAXBElement<ReturnTicketResponse>(_ReturnTicketResponse_QNAME, ReturnTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.task3.lab.epam.com/", name = "getTicketById")
    public JAXBElement<GetTicketById> createGetTicketById(GetTicketById value) {
        return new JAXBElement<GetTicketById>(_GetTicketById_QNAME, GetTicketById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayForTheTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.task3.lab.epam.com/", name = "payForTheTicketResponse")
    public JAXBElement<PayForTheTicketResponse> createPayForTheTicketResponse(PayForTheTicketResponse value) {
        return new JAXBElement<PayForTheTicketResponse>(_PayForTheTicketResponse_QNAME, PayForTheTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.task3.lab.epam.com/", name = "bookTicket")
    public JAXBElement<BookTicket> createBookTicket(BookTicket value) {
        return new JAXBElement<BookTicket>(_BookTicket_QNAME, BookTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.task3.lab.epam.com/", name = "getTicketByIdResponse")
    public JAXBElement<GetTicketByIdResponse> createGetTicketByIdResponse(GetTicketByIdResponse value) {
        return new JAXBElement<GetTicketByIdResponse>(_GetTicketByIdResponse_QNAME, GetTicketByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.task3.lab.epam.com/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayForTheTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.task3.lab.epam.com/", name = "payForTheTicket")
    public JAXBElement<PayForTheTicket> createPayForTheTicket(PayForTheTicket value) {
        return new JAXBElement<PayForTheTicket>(_PayForTheTicket_QNAME, PayForTheTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ticket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.task3.lab.epam.com/", name = "ticket")
    public JAXBElement<Ticket> createTicket(Ticket value) {
        return new JAXBElement<Ticket>(_Ticket_QNAME, Ticket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.task3.lab.epam.com/", name = "returnTicket")
    public JAXBElement<ReturnTicket> createReturnTicket(ReturnTicket value) {
        return new JAXBElement<ReturnTicket>(_ReturnTicket_QNAME, ReturnTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.task3.lab.epam.com/", name = "bookTicketResponse")
    public JAXBElement<BookTicketResponse> createBookTicketResponse(BookTicketResponse value) {
        return new JAXBElement<BookTicketResponse>(_BookTicketResponse_QNAME, BookTicketResponse.class, null, value);
    }

}
