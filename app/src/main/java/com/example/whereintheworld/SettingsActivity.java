package com.example.whereintheworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    public Switch bathroomSwitch;///bathroom_switch
    public Switch foodKitchenSwitch;///bathroom_switch
    public Switch shelterSwitch;///bathroom_switch

    public Button applyButton;

    public boolean[] preference;

    private Boolean bathroom;
    private Boolean foodKitchen;
    private Boolean shelter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_settings);

        bathroomSwitch = findViewById(R.id.bathroom_switch);
        foodKitchenSwitch = findViewById(R.id.foodKitchen_switch);
        shelterSwitch = findViewById(R.id.shelter_switch);

        preference = new boolean[3];

        applyButton = findViewById(R.id.applyButton);
        applyButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                bathroom = bathroomSwitch.isChecked();
                foodKitchen = foodKitchenSwitch.isChecked();
                shelter = shelterSwitch.isChecked();

                preference[0]=(bathroom);
                preference[1]=(foodKitchen);
                preference[2]=(shelter);

                Intent intent = new Intent (getApplicationContext(),MainActivity.class);
                intent.putExtra("preference",preference);
                startActivity(intent);
            }
        });

                /*toSettingsButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent settingsIntent = new Intent (getApplicationContext(),SettingsActivity.class);
                //
                startActivity(settingsIntent);
            }
        });*/



    }

}
