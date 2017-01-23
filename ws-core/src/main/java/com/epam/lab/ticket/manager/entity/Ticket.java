package com.epam.lab.ticket.manager.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Ivan_Lohvinau on 1/23/2017.
 */
@Entity
@Table(name = "Ticket")
public class Ticket {

    @Id
    @Column(name = "ticketId")
    @GeneratedValue
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
    private StateTicket state;

    @ManyToOne
    @JoinColumn(name = "personId")
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
