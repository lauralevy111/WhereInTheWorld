package com.example.whereintheworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    public Button toMapButton;
    public Button toSettingsButton;

    private String preferenceToast ="err";
    private boolean[] prefs;

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


        Intent toMainIntent = getIntent();
        if(toMainIntent.getExtras()!=null){
            preferenceToast="";
            Serializable series = toMainIntent.getBooleanArrayExtra("preference");
            //for(boolean b :series){
            /*for(int i = 0; i<series.)
                preferenceToast+="b\n";
                Toast.makeText(getApplicationContext(),
                        preferenceToast,
                        Toast.LENGTH_SHORT).show();
            }*///not done
            Toast.makeText(getApplicationContext(),
                    preferenceToast,
                    Toast.LENGTH_SHORT).show();
        }
    }
}
