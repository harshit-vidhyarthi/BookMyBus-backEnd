package com.webapp.bookMyBus.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long uid;

    @NotBlank
    @Column
    private String fname;

    @NotBlank
    @Column
    private String lname;

    @NotBlank
    @Email
    @Column(unique = true)
    private String username;

    @NotNull
    @Size(min = 8)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @OneToMany(mappedBy="user",cascade = CascadeType.ALL)
    private List<Ticket> tickets;

    public User() {

    }

    public User(Long uid, String fname, String lname, String username, String password, List<Ticket> tickets) {
        this.uid = uid;
        this.lname=lname;
        this.fname=fname;
        this.username = username;
        this.password=password;
        this.tickets=tickets;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFname() {
        return fname;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
