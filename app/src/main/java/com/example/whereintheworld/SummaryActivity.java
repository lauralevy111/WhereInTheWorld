package com.example.whereintheworld;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SummaryActivity extends AppCompatActivity {

    public Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.intent =getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

    }
}
