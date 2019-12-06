package com.webapp.bookMyBus.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class TravelCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cid;

    @OneToMany(mappedBy="travelCompany",cascade = CascadeType.ALL)
    private List<Bus> buses;

    @NotBlank
    @Column
    private String name;

    @NotBlank
    @Column
    private String tier;

    @NotBlank
    @Column
    private String rating;

    public TravelCompany() {
    }

    public TravelCompany(Long cid, List<Bus> buses, @NotBlank String name, @NotBlank String tier, @NotBlank String rating) {
        this.cid = cid;
        this.buses = buses;
        this.name = name;
        this.tier = tier;
        this.rating = rating;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public List<Bus> getBuses() {
        return buses;
    }

    public void setBuses(List<Bus> buses) {
        this.buses = buses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
