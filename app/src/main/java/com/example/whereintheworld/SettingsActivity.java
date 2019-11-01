package com.example.whereintheworld;

import android.os.Bundle;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    public Switch bathroomSwitch;///bathroom_switch
    public Switch foodKitchenSwitch;///bathroom_switch
    public Switch shelterSwitch;///bathroom_switch

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_settings);

        bathroomSwitch = findViewById(R.id.bathroom_switch);
        foodKitchenSwitch = findViewById(R.id.foodKitchen_switch);
        shelterSwitch = findViewById(R.id.shelter_switch);



    }

}
