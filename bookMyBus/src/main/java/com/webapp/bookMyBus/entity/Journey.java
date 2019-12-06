package com.webapp.bookMyBus.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Entity
public class Journey {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long jid;

    @OneToMany(mappedBy="journey",cascade = CascadeType.ALL)
    private List<Ticket> tickets;

    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "route_id")
    private Route route;

    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "bus_id")
    private Bus bus;

    @NotBlank
    @Column
    private int available_seats;

    @NotBlank
    @Column
    private Date start_date;

    @NotBlank
    @Column
    private Date end_date;

    public Journey() {
    }

    public Journey(Long jid, List<Ticket> tickets, Route route, Bus bus, @NotBlank int available_seats, @NotBlank Date start_date, @NotBlank Date end_date) {
        this.jid = jid;
        this.tickets = tickets;
        this.route = route;
        this.bus = bus;
        this.available_seats = available_seats;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public Long getJid() {
        return jid;
    }

    public void setJid(Long jid) {
        this.jid = jid;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public int getAvailable_seats() {
        return available_seats;
    }

    public void setAvailable_seats(int available_seats) {
        this.available_seats = available_seats;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
}
