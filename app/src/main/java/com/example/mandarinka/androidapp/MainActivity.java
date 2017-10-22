package com.example.mandarinka.androidapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailed_information_main);
    }

    public void clickDistance(View v) {
        System.out.println("clickDistance");
    }

    public void clickPhone(View v) {
        System.out.println(" clickPhone");
    }


}