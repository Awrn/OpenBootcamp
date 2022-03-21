package com.alvarowagner;

public class SmartPhone extends SmartDevice{

    String speakerbrand;
    boolean isFlipFlop;


    public SmartPhone(){

    }

    public SmartPhone(String brand, String model, int batterycapacity, boolean fastCharge, boolean has5G, DeviceScreen screen, String speakerbrand, boolean isFlipFlop) {
        super(brand, model, batterycapacity, fastCharge, has5G, screen);
        this.speakerbrand = speakerbrand;
        this.isFlipFlop = isFlipFlop;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", batterycapacity=" + batterycapacity +
                ", fastCharge=" + fastCharge +
                ", has5G=" + has5G +
                ", screen=" + screen +
                ", speakerbrand='" + speakerbrand + '\'' +
                ", isFlipFlop=" + isFlipFlop +
                '}';
    }
}
