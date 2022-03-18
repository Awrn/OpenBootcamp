package com.alvarowagner;

public class Main {

    public static void main(String[] args) {

        String[] nombres = {"Pepo","Yuset","Pepe","Diset","Pepon","17","Maquina"};
        String cadenaNombres="";
        String cadenaNombres2="";
        String cadenaNombres3="";


        for (int i = 0; i < nombres.length; i++ ){

            cadenaNombres += (nombres[i] + ":" + i + ", ") ;
        }
        System.out.println(cadenaNombres);

        System.out.println("--------------------------");

        for(String nombre : nombres){

            cadenaNombres2 += (nombre + ", " ) ;
            cadenaNombres3 = cadenaNombres3.concat(nombre + ", ");

        }
        System.out.println(cadenaNombres2);
        System.out.println("con el metodo concat: " + cadenaNombres3);



    }
}
