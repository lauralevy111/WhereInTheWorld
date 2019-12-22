package com.example.whereintheworld;

public class User {

    public String name;
    private int id;
    private String email;

    private double invoice = 0;

    public User(String name, String email){this.name = name; this.email = email;}

    public void changeEmail(String newEmail){
        email=newEmail;
    }

    private void bill(double amount) {
        invoice += amount;
        System.out.println("pls pay us ? this amount : "+invoice+amount);

    }

    public void receivePayment(double amount){
        invoice -= amount;
        System.out.println("thank you for your payment of "+amount+"\nyour balance is now "+invoice);
    }

    public double getInvoice(){
        return invoice;
    }

    public String getName(){
        System.out.println("name : "+name);

        return name;
    }
}
