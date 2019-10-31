package com.example.whereintheworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public Button toMapButton;
    public Button toSettingsButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acticity_main);

        toMapButton = findViewById(R.id.toMapActivityButton);
        toMapButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent (getApplicationContext(),MapsActivity.class);
                //
                startActivity(intent);
            }
        });
        toSettingsButton = findViewById(R.id.toSettingsActivityButton);
        toSettingsButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent settingsIntent = new Intent (getApplicationContext(),SettingsActivity.class);
                //
                startActivity(settingsIntent);
            }
        });
    }
}
