package com.s.passengerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startPassengerHomeActivity(View v){
        startActivity(new Intent(v.getContext(), LoginActivity.class));
    }
    public void startClientHomeActivity(View v){
        startActivity(new Intent(v.getContext(), ClientHomeActivity.class));
    }
}