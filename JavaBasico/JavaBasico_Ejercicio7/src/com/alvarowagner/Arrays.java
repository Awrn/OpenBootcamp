package com.alvarowagner;

public class Arrays {

    //dos formas de hacer arrays simples
    public static void main(String[] args) {

        int arraynum1[] = new int[3];

        arraynum1[0] = 13;
        arraynum1[1] = 11;
        arraynum1[2] = 14;

        int arraynum2[] = {15,46,57,68};

        String[] nombres = {
                "Pepe",
                "Ferran",
                "Eduartist"
        };

        //recorrrer de forma rapida con for each, desventaja es que no recibimos
        // el indice (i) a diferencia del for normal

        for (String nombre: nombres){
            System.out.println(nombre);
        }

        //Array bidimensional / tri

        int arrayBid[] []= new int[2][4];

        arrayBid[0][0] = 1;
        arrayBid[0][1] = 1;
        arrayBid[0][2] = 1;
        arrayBid[0][3] = 1;

        arrayBid[1][0] = 2;
        arrayBid[1][1] = 2;
        arrayBid[1][2] = 2;
        arrayBid[1][3] = 2;

        for(int i = 0 ; i < arrayBid.length ; i++ ){

            System.out.println("valor de i: " + i);

            System.out.println("valor de i; " + i);
            for (int j = 0 ; j < arrayBid[1].length ; j++){

                System.out.println("valor de i: " + j);
                System.out.println(arrayBid[1][j]);

            }


        }



    }
}
