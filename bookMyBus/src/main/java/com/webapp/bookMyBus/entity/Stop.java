package com.webapp.bookMyBus.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class Stop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sid;

    @OneToMany(mappedBy="source_stop",cascade = CascadeType.ALL)
    private List<Route> routes_with_this_stop_as_source;

    @OneToMany(mappedBy="destination_stop",cascade = CascadeType.ALL)
    private List<Route> routes_with_this_stop_as_destination;

    @NotBlank
    @Column
    private String name;

    public Stop() {
    }

    public Stop(Long sid, List<Route> routes_with_this_stop_as_source, List<Route> routes_with_this_stop_as_destination, @NotBlank String name) {
        this.sid = sid;
        this.routes_with_this_stop_as_source = routes_with_this_stop_as_source;
        this.routes_with_this_stop_as_destination = routes_with_this_stop_as_destination;
        this.name = name;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public List<Route> getRoutes_with_this_stop_as_source() {
        return routes_with_this_stop_as_source;
    }

    public void setRoutes_with_this_stop_as_source(List<Route> routes_with_this_stop_as_source) {
        this.routes_with_this_stop_as_source = routes_with_this_stop_as_source;
    }

    public List<Route> getRoutes_with_this_stop_as_destination() {
        return routes_with_this_stop_as_destination;
    }

    public void setRoutes_with_this_stop_as_destination(List<Route> routes_with_this_stop_as_destination) {
        this.routes_with_this_stop_as_destination = routes_with_this_stop_as_destination;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
