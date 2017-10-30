package com.example.mandarinka.androidapp;

public class BranchItem {
    private String address;
    private String name;
    private Location location;
    private String workMode;
    private String phoneNumber;
    private String quality;

    private String distance;

    public BranchItem() {
    }

    public BranchItem(String address, String name, String distance) {
        this.address = address;
        this.name = name;
        this.distance = distance;
    }

    public BranchItem(String address, String name, String workMode, String phoneNumber, String quality, String distance) {
        this.address = address;
        this.name = name;
        this.workMode = workMode;
        this.phoneNumber = phoneNumber;
        this.quality = quality;
        this.distance = distance;
    }

    public BranchItem(String address, String name, Location location, String workMode, String phoneNumber, String quality) {
        this.address = address;
        this.name = name;
        this.location = location;
        this.workMode = workMode;
        this.phoneNumber = phoneNumber;
        this.quality = quality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getWorkMode() {
        return workMode;
    }

    public void setWorkMode(String workMode) {
        this.workMode = workMode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BranchItem that = (BranchItem) o;

        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null)
            return false;
        if (workMode != null ? !workMode.equals(that.workMode) : that.workMode != null)
            return false;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null)
            return false;
        if (quality != null ? !quality.equals(that.quality) : that.quality != null) return false;
        return distance != null ? distance.equals(that.distance) : that.distance == null;

    }

    @Override
    public int hashCode() {
        int result = address != null ? address.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (workMode != null ? workMode.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (quality != null ? quality.hashCode() : 0);
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        return result;
    }
}

