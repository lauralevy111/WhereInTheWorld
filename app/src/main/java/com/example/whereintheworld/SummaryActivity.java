package com.example.whereintheworld;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SummaryActivity extends AppCompatActivity {

    public Intent intent;

    public TextView bigTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.intent =getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        bigTextView= findViewById(R.id.bigTextView);

        String bigTextFill = "XXXXXXX\n XXXXXXXX\n XXXXX\nXXXXX\nXXXXX\nSSSXXX\nXXXXXX";

        bigTextView.setText(bigTextFill);

    }
}
