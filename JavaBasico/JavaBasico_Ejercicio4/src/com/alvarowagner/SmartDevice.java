package com.alvarowagner;

public abstract class SmartDevice {


    String brand;
    String model;
    int batterycapacity;
    boolean fastCharge;
    boolean has5G;
    DeviceScreen screen = new DeviceScreen();


    public SmartDevice(){

    }


    public SmartDevice(String brand, String model, int batterycapacity, boolean fastCharge, boolean has5G, DeviceScreen screen) {
        this.brand = brand;
        this.model = model;
        this.batterycapacity = batterycapacity;
        this.fastCharge = fastCharge;
        this.has5G = has5G;
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", batterycapacity=" + batterycapacity +
                ", fastCharge=" + fastCharge +
                ", has5G=" + has5G +
                ", screen=" + screen +
                '}';
    }
}
