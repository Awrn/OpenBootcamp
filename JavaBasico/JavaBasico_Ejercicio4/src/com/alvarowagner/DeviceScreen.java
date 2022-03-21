package com.alvarowagner;

public class DeviceScreen {

    String brand;
    int width;
    int height;
    String type ;
    String resolution;

    public DeviceScreen(){

    }

    public DeviceScreen(String brand, int width, int height, String type, String resolution) {
        this.brand = brand;
        this.width = width;
        this.height = height;
        this.type = type;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "DeviceScreen{" +
                "brand='" + brand + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", type='" + type + '\'' +
                ", resolution='" + resolution + '\'' +
                '}';
    }
}
