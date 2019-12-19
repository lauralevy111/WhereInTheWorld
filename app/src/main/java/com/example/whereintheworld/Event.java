package com.example.whereintheworld;

import java.sql.Date;

public class Event {

    public Hub hub;
    public String name;
    public Date date;
    public String address;

    public Event(String name, Date date){
        this.name = name;
        this.date = date;
    }

    public void setHub(String hubName, int mylong, int mylat){
        hub = new Hub(hubName, mylong, mylat);

    }

    public void setAddress(String newAddress){ address= newAddress;}
}
