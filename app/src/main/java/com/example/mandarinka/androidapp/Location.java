package com.example.mandarinka.androidapp;

/**
 * Created by mandarinka on 22.10.17.
 */

public class Location {
    private Double latitube;
    private Double longitube;

    public Location() {
    }

    public Location(Double latitube, Double longitube) {
        this.latitube = latitube;
        this.longitube = longitube;
    }

    public Double getLatitube() {
        return latitube;
    }

    public void setLatitube(Double latitube) {
        this.latitube = latitube;
    }

    public Double getLongitube() {
        return longitube;
    }

    public void setLongitube(Double longitube) {
        this.longitube = longitube;
    }
}
