package com.alvarowagner.ejercicios;

import java.util.Vector;

public class EsjercicioVectores_3 {

    public static void main(String[] args) {

        Vector<String>  vectorNombres = new Vector<String>(10,5);

        vectorNombres.add(0,"pepe");
        vectorNombres.add(1,"juan");
        vectorNombres.add(2,"pedro");
        vectorNombres.add(3,"marc");
        vectorNombres.add(4,"victor");

        System.out.println(vectorNombres);
         vectorNombres.remove(3);

        System.out.println(vectorNombres);

        System.out.println("---------------------");

        RecorrerVecotr(vectorNombres);

    }

    public static void RecorrerVecotr (Vector<String> vector){

        for (int i = 0; i < vector.size(); i++){
            System.out.println(vector.get(i));
        }
    }

}
