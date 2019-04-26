package com.cognizant.model;

import java.util.Date;
import java.util.List;

public class Flight {

    private int id;
    private Date departsOn;
    private String origin;
    private String destination;
    List<Person> personList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDepartsOn() {
        return departsOn;
    }

    public void setDepartsOn(Date departsOn) {
        this.departsOn = departsOn;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
