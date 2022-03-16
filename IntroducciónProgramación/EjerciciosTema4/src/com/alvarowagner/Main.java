package com.alvarowagner;

public class Main {

    public static void main(String[] args) {

        int numeroIF = -5;

        int numeroWhile = 0;

        int numeroDoWhile = 0;

        String estacion = "Otoño";




        //Ejercicio if
        System.out.println("----------------------");


        if (numeroIF > 0){

            System.out.println(numeroIF + ", " + "El numero es positivo");
        }else {
            System.out.println(numeroIF + ", " + "El numero es negativo");
        }

        //Ejercicio While
        System.out.println("----------------------");

        while (numeroWhile < 3){

            numeroWhile ++;
            System.out.println(numeroWhile + ", " + "Valor del NumeroWhile");
        }

        //Ejercicio Do/While
        System.out.println("----------------------");

        do{

           System.out.println(numeroDoWhile + ", " + "Valor del NumeroDoWhile");
           numeroDoWhile ++;

        }while (numeroDoWhile < 1);

        //Ejercicio For
        System.out.println("----------------------");

        for(int numeroFor = 0; numeroFor <= 3; numeroFor ++ ){

            System.out.println(numeroFor+ ", " + "Valor del NumeroFor");
        }

        //Ejercicio Switch
        System.out.println("----------------------");

        switch (estacion){

            case "Verano":
                System.out.println("Verano");
                break;
            case "Invierno":
                System.out.println("Invierno");
                break;
            case "Otoño":
                System.out.println("Otoño");
                break;
            case "Primavera":
                System.out.println("Primavera");
                break;
            default:
                System.out.println("No has introducido una estacion bobo");




        }

    }
}
