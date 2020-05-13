package com.example.flagsoftheworld;

public class Flag {
    private int flagResource;
    private String countryName;

    public Flag(int r,String n){
        flagResource=r;
        countryName=n;
    }

    public int getFlagResource() {
        return flagResource;
    }

    public void setFlagResource(int flagResource) {
        this.flagResource = flagResource;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
