package com.example.whereintheworld;

public class Hub {

    private String name;
    private int longitude;
    private int latitude;

    public Hub(String name, int longitude, int latitude){
        this.name = name;
        this.longitude = longitude;
        this.latitude=latitude;
    }

    public double getDistance(int mylong, int mylat){
        double distance = 0;
        int difflong = mylong-longitude;
        int difflat = mylat-latitude;

        //todo: find distnace?
        return distance;
    }
}
