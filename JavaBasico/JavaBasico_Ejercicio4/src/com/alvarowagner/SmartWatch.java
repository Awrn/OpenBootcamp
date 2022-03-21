package com.alvarowagner;

public class SmartWatch extends SmartDevice {

    String bandMaterial;
    int hour;

    public SmartWatch(){

    }

    public SmartWatch(String brand, String model, int batterycapacity, boolean fastCharge, boolean has5G, DeviceScreen screen, String bandMaterial, int hour) {
        super(brand, model, batterycapacity, fastCharge, has5G, screen);
        this.bandMaterial = bandMaterial;
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", batterycapacity=" + batterycapacity +
                ", fastCharge=" + fastCharge +
                ", has5G=" + has5G +
                ", screen=" + screen +
                ", bandMaterial='" + bandMaterial + '\'' +
                ", hour=" + hour +
                '}';
    }
}
