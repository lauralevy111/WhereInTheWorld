package com.example.whereintheworld;

import java.util.ArrayList;

public class AdminUser extends User {

    public Group group;

    private ArrayList<User> members;

    public AdminUser(String name, String email, long adminID, Group group){
        super(name,email);
        this.group = group;
        this.members = group.getMembers();

    }

    public void createHub(String name, int longitude, int lattitude){
        Hub newHub = new Hub (name,longitude,lattitude,true);

    }

    public void announce(String message){

    }
}
