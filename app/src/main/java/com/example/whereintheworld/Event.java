package com.example.whereintheworld;

import java.sql.Date;
import java.util.ArrayList;

public class Event {

    private Hub hub;
    public String name;
    private Date date;
    private AdminUser eventAdmin;
    private String address;

    private ArrayList<User> attendees;

    private Double admissionPrice;

    public Event(String name, Date date, AdminUser eventAdmin){
        this.name = name;
        this.date = date;
        this.eventAdmin = eventAdmin;
        chargeAdmission();
        reinburseAdmission();
    }

    public void setHub(String hubName, int mylong, int mylat, boolean active){
        hub = new Hub(hubName, mylong, mylat,active);

    }

    public void setAddress(String newAddress){ address= newAddress;}

    public void addAttendee(User attendee){
        attendees.add(attendee);
    }
    public void chargeAdmission(){
        for(User attendee: attendees){
            attendee.bill(admissionPrice);
            if(attendee.getInvoice()<0){
                System.out.println("attendee: "+attendee.getName()+" aint got enough money to come to this event ("+name+") lol srry bb");
            }
        }
    }

    public void reinburseAdmission(){
        for(User attendee: attendees){
            attendee.reinburse(admissionPrice);

        }
    }
}
