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
}
