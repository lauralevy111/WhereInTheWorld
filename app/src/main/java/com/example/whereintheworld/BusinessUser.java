package com.example.whereintheworld;

public class BusinessUser extends User{

    public int businessID;

    public double invoice;

    public BusinessUser(String name, String email, int businessID){
        super(name, email);
    }

    public void  bill(double amount) {
        invoice += amount;
        System.out.println("pls pay us ? this amount : "+invoice+amount);

    }

    public void receivePayment(double amount){
        invoice -= amount;
        System.out.println("thank you for your payment of "+amount+"\nyour balance is now "+invoice);
    }


}
