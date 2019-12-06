package com.webapp.bookMyBus.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long tid;

    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "journey_id")
    private Journey journey;

    @NotBlank
    @Column
    private String pnr;

    @NotBlank
    @Column
    private int seat_no;

    @NotBlank
    @Column
    private int price;

    public Ticket() {
    }

    public Ticket(Long tid, User user, Journey journey, @NotBlank String pnr, @NotBlank int seat_no, @NotBlank int price) {
        this.tid = tid;
        this.user = user;
        this.journey = journey;
        this.pnr = pnr;
        this.seat_no = seat_no;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setJourney(Journey journey) {
        this.journey = journey;
    }

    public int getSeat_no() {
        return seat_no;
    }

    public Journey getJourney() {
        return journey;
    }

    public Long getTid() {
        return tid;
    }

    public String getPnr() {
        return pnr;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public void setSeat_no(int seat_no) {
        this.seat_no = seat_no;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

