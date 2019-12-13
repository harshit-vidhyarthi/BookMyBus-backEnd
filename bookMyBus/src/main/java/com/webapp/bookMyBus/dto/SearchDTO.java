package com.webapp.bookMyBus.dto;

import java.util.Date;

public class SearchDTO {
    private String source;
    private String destination;
    private Date date;

    public SearchDTO(String source, String destination, Date date) {
        this.source = source;
        this.destination = destination;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
