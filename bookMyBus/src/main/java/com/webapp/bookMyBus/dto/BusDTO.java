package com.webapp.bookMyBus.dto;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

public class BusDTO {
    private Long jid;
    private String source;
    private String destination;
    private String distance;
    private int availableSeats;
    public int totalSeats;
    public String rating;
    public String travelCompany;
    private Date startDate;
    private Date endDate;

    public BusDTO(Long jid, String source, String destination, String distance, int availableSeats, int totalSeats, String rating, String travelCompany, Date startDate, Date endDate) {
        this.jid = jid;
        this.source = source;
        this.destination = destination;
        this.distance = distance;
        this.availableSeats = availableSeats;
        this.totalSeats = totalSeats;
        this.rating = rating;
        this.travelCompany = travelCompany;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public BusDTO() {
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Long getJid() {
        return jid;
    }

    public void setJid(Long jid) {
        this.jid = jid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
