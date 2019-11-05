package com.example.whereintheworld;

public class MapPreference {

    public boolean bathroom;
    public boolean foodKitchen;
    public boolean shelter;

    public MapPreference(boolean bathroom, boolean foodKitchen, boolean shelter) {
        this.bathroom = bathroom;
        this.foodKitchen = foodKitchen;
        this.shelter = shelter;

    }

    public void setBathroom(boolean bathroom) {
        this.bathroom = bathroom;
    }
    public void setFoodKitchen(boolean foodKitchen){
        this.foodKitchen = foodKitchen;
    }
    public void setShelter(boolean shelter){
        this.shelter = shelter;
    }

}
