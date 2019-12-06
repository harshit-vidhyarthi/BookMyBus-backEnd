package com.webapp.bookMyBus.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long rid;

    @OneToMany(mappedBy="route",cascade = CascadeType.ALL)
    private List<Journey> journeys;

    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "source_stopid")
    private Stop source_stop;

    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "destination_stopid")
    private Stop destination_stop;

    @NotBlank
    @Column
    private String distance;

    public Route() {
    }

    public Route(Long rid, List<Journey> journeys, Stop source_stop, Stop destination_stop, @NotBlank String distance) {
        this.rid = rid;
        this.journeys = journeys;
        this.source_stop = source_stop;
        this.destination_stop = destination_stop;
        this.distance = distance;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public List<Journey> getJourneys() {
        return journeys;
    }

    public void setJourneys(List<Journey> journeys) {
        this.journeys = journeys;
    }

    public Stop getSource_stop() {
        return source_stop;
    }

    public void setSource_stop(Stop source_stop) {
        this.source_stop = source_stop;
    }

    public Stop getDestination_stop() {
        return destination_stop;
    }

    public void setDestination_stop(Stop destination_stop) {
        this.destination_stop = destination_stop;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }
}
