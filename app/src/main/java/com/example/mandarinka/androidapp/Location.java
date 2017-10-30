package com.example.mandarinka.androidapp;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;

        if (latitube != null ? !latitube.equals(location.latitube) : location.latitube != null)
            return false;
        return longitube != null ? longitube.equals(location.longitube) : location.longitube == null;

    }

    @Override
    public int hashCode() {
        int result = latitube != null ? latitube.hashCode() : 0;
        result = 31 * result + (longitube != null ? longitube.hashCode() : 0);
        return result;
    }
}
