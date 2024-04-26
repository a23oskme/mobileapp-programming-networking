package com.example.networking;

public class Mountain {

    private String name;
    private String location;
    private int height;

    // default constructor
    public Mountain() {
        name = "Saknar namn";
        location = "Saknar plats";
        height = -1;
    }
    public Mountain(String n, String l, int h) {
        name = n;
        location = l;
        height = h;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", height=" + height +
                '}';
    }

    /*public void setName(String n) {
        name = n;
    }*/

    public String getName() {
        return name;
    }

    /*public void setLocation(String l) {
        location = l;
    }*/

    public String getLocation() {
        return location;
    }

    /*public void setHeight(int h) {
        height = h;
    }*/

    public String getHeight() {
        return ""+height;
    }

}
