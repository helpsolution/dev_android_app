package com.example.mandarinka.androidapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailed_information_main)
    }

    fun clickDistance(v: View) {
        println("clickDistance")
    }

    fun clickPhone(v:View){
        println("clickPhone")
    }

}
