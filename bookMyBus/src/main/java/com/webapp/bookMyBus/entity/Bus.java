package com.webapp.bookMyBus.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bid;

    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "company_id")
    private TravelCompany travelCompany;

    @NotBlank
    @Column
    private String type;

    @NotBlank
    @Column
    private int total_seats;

    @NotBlank
    @Column
    private String rating;

    public Bus() {
    }

    public Bus(Long bid, TravelCompany travelCompany, @NotBlank String type, @NotBlank int total_seats, @NotBlank String rating) {
        this.bid = bid;
        this.travelCompany = travelCompany;
        this.type = type;
        this.total_seats = total_seats;
        this.rating = rating;
    }

    public Long getBid() {
        return bid;
    }

    public void setBid(Long bid) {
        this.bid = bid;
    }

    public TravelCompany getTravelCompany() {
        return travelCompany;
    }

    public void setTravelCompany(TravelCompany travelCompany) {
        this.travelCompany = travelCompany;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotal_seats() {
        return total_seats;
    }

    public void setTotal_seats(int total_seats) {
        this.total_seats = total_seats;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
