package com.example.whereintheworld;

public class MapPreference {

    public boolean bathroom;
    public boolean foodKitchen;
    public boolean shelter;

    public int locationid;

    public MapPreference(/*boolean bathroom, boolean foodKitchen, boolean shelter*/int locationid) {
        /*this.bathroom = bathroom;
        this.foodKitchen = foodKitchen;
        this.shelter = shelter;*/
        this.locationid=locationid;

    }

    public void setLocationid(int locationid){
        this.locationid=locationid;
    }
    public int getLocationid(){
        return locationid;
    }

    /*

    public void setBathroom(boolean bathroom) {
        this.bathroom = bathroom;
    }
    public void setFoodKitchen(boolean foodKitchen){
        this.foodKitchen = foodKitchen;
    }
    public void setShelter(boolean shelter){
        this.shelter = shelter;
    }

     */

}
