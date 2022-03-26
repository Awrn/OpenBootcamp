package com.alvarowagner.ejercicios;

public class UnidimensionalString_1 {

    public static void main(String[] args) {

        String[] nombres= {
                "Pepe",
                "Juan",
                "Mikela"
        };


        System.out.println(array(nombres));
    }

    public static String array (String[] nombres){
        String nombresconcat = "";

        for(String nombre : nombres){

            nombresconcat += nombre + " ";
        }

        return nombresconcat;
    }

}
