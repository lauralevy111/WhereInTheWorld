package com.example.whereintheworld;

public class AdminUser extends User {

    public Group group;
    public AdminUser(String name, String email, long adminID, Group group){
        super(name,email);
        this.group = group;


    }

    public void createHub(String name, int longitude, int lattitude){
        Hub newHub = new Hub (name,longitude,lattitude,true);

    }
}
