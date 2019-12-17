package com.example.whereintheworld;

public class AdminUser extends User {
    public AdminUser(String name, String email, long adminID){
        super(name,email);


    }

    public void createHub(String name, int longitude, int lattitude){
        Hub newHub = new Hub (name,longitude,lattitude);

    }
}
