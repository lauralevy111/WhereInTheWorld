package com.example.whereintheworld;

public class Hub {

    private String name;
    private int longitude;
    private int latitude;
    private boolean active;

    public Hub(String name, int longitude, int latitude, boolean active){
        this.name = name;
        this.longitude = longitude;
        this.latitude=latitude;
        this.active = active;
    }

    public double getDistance(int mylong, int mylat) {
        double distance = 0;
        int difflong = mylong - longitude;
        int difflat = mylat - latitude;

        //todo: find distnace?
        int longSq = difflong*difflong;
        int latSq = difflat*difflat;

        distance =Math.sqrt(longSq+latSq);

        return distance;
    }

    public void promote(User promotedUser){
        //advirtizing functionality

    }
}
