package com.alvarowagner.ejercicios;

public class BidimensionalArray_2 {


    public static void main(String[] args) {

        int array[][] = {
                {4,5,6},
                {10,20,30}

        };

        ArrayBidi(array);
    }

    public static void ArrayBidi (int[][] arrayenteros){

        for (int i = 0; i < arrayenteros.length  ; i++){

            for (int j = 0; j < arrayenteros[i].length  ; j++){

                System.out.println("Estamos en posicion i = " + i + " y en posicion j = " + j + ", y el valor es: " + arrayenteros[i][j]);
            }

        }


    }






}
