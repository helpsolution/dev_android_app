package com.example.mandarinka.androidapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetailedInfoMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_information_main);

        Intent intent = getIntent();
        String address = intent.getStringExtra(MainActivity.EXTRA_ADDRESS);
        String name = intent.getStringExtra(MainActivity.EXTRA_NAME);
        String distance = intent.getStringExtra(MainActivity.EXTRA_DISTANCE);

        TextView textViewToChangeAddress = (TextView) findViewById(R.id.DI_adress);
        TextView textViewToChangeName = (TextView) findViewById(R.id.DI_name);
        TextView textViewToChangeDistance = (TextView) findViewById(R.id.DI_distance);
        textViewToChangeAddress.setText(address);
        textViewToChangeName.setText(name);
        textViewToChangeDistance.setText(distance);
    }
}
