package com.alvarowagner;

public class Main {

    public static void main(String[] args) {

        Coche coche = new Coche();
        int resultado = suma(1,2,3);

        System.out.println(resultado);

        coche.Sumarpuertas();
        System.out.println(coche.puertas);

        coche.Sumarpuertas();
        System.out.println(coche.puertas);
    }


    public static int suma (int num1, int num2, int num3) {

        return num1 + num2 + num3;

    }
}
