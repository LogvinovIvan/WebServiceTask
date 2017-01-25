package com.epam.lab.ticket.manager.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;


@Entity
@Table(name = "Ticket")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Ticket {

    @Id
    @Column(name = "ticketId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @XmlElement
    private Long numberTicket;


    @Column(name = "departureCity")
    private String departureCity;
    @Column(name = "arrivalCity")
    private String arrivalCity;
    @Column(name = "cost")
    private Integer cost;
    @Column(name = "departureTime")
    private Date departureTime;
    @Column(name = "arrivalTime")
    private Date arrivalTime;
    @Enumerated(EnumType.STRING)
    @Column(name = "state")
    private StateTicket state;

    @ManyToOne
    @JoinColumn(name = "person_id_person")
    private Person person;


    public Long getNumberTicket() {
        return numberTicket;
    }

    public void setNumberTicket(Long numberTicket) {
        this.numberTicket = numberTicket;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public StateTicket getState() {
        return state;
    }

    public void setState(StateTicket state) {
        this.state = state;
    }

    @Transient
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
