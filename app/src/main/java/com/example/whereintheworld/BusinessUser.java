package com.example.whereintheworld;

public class BusinessUser extends User{

    public int businessID;

    public BusinessUser(String name, String email, int businessID){
        super(name, email);
    }
}
