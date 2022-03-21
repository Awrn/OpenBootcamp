package com.alvarowagner;

public class Main {

    public static void main(String[] args) {


        DeviceScreen samsungScreen = new DeviceScreen("Samsung",20,29,"Amoled","2k");
        DeviceScreen indieTechScreen = new DeviceScreen("IndieTech",18,25,"Amoled","1080p");

        SmartPhone iphone13S = new SmartPhone("Apple","Iphone11S",3200,true,true,samsungScreen,"Bits",false);
        SmartPhone xiamoiMI9T = new SmartPhone("Xiaomi","MI9T",3500,true,false,indieTechScreen,"Xiaomi",false);

        System.out.println(iphone13S);

        iphone13S.screen.brand = "-----";
        iphone13S.has5G = false;
        iphone13S.batterycapacity = 3900;


        System.out.println(iphone13S);

        System.out.println(xiamoiMI9T);

    }
}
