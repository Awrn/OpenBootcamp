package com.alvarowagner;

import java.util.HashMap;
import java.util.Map;

public class Mapas {

    public static void main(String[] args) {

        // hay muchos tipos de mapas TreeMap

        HashMap<String,Integer> mapa = new HashMap<>();
        mapa.put("clave1", 10);
        mapa.put("clave2", 10);
        mapa.put("clave3", 10);
        mapa.put("clave4", 10);


        System.out.println(mapa);
        System.out.println(mapa.get("clave1"));

        //reemplazar

        mapa.put("clave4", 15); //se soobreescribe si existe pero no es la forma .replace
        mapa.replace("clave4", 30); // si hacemos un replace y no existe no se va a crear

        //iterar sobre mapas

        for(Map.Entry elemento: mapa.entrySet()){

            System.out.println("Elemento clave es: " + elemento.getKey());
            System.out.println("Elemento valor es: " + elemento.getValue());
        }

    }
}
