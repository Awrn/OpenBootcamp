package com.alvarowagner;

public class Main {

    public static void main(String[] args) {


        DeviceScreen samsungScreen = new DeviceScreen("Samsung",20,29,"Amoled","2k");
        DeviceScreen indieTechScreen = new DeviceScreen("IndieTech",18,25,"Amoled","1080p");
        DeviceScreen indieTechScreenMini = new DeviceScreen("IndieTech",10,15,"LED","480p");

        SmartPhone iphone13 = new SmartPhone("Apple","Iphone 13",3200,true,
                true,samsungScreen,"Bits",false);
        SmartPhone xiamoiMI9T = new SmartPhone("Xiaomi","MI9T",3500,true,
                false,indieTechScreen,"Xiaomi",false);

        SmartWatch iWatch5Pro = new SmartWatch ("Apple","iWatch5 Pro",1250,false,
                false,indieTechScreenMini,"Leather",17);



        System.out.println(iphone13);

        iphone13.model = "Iphone 13S";
        iphone13.screen.brand = "-----";
        iphone13.has5G = false;
        iphone13.batterycapacity = 3900;


        System.out.println(iphone13);

        System.out.println(xiamoiMI9T);

        System.out.println(iWatch5Pro);

        System.out.println("hola");

    }
}
