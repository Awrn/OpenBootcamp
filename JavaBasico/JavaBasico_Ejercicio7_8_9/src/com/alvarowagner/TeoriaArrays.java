package com.alvarowagner;

import java.util.Vector;

public class TeoriaArrays {

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

        arrayBid[0][0] = 0;
        arrayBid[0][1] = 1;
        arrayBid[0][2] = 2;
        arrayBid[0][3] = 3;

        arrayBid[1][0] = 13;
        arrayBid[1][1] = 23;
        arrayBid[1][2] = 42;
        arrayBid[1][3] = 52;

        int arrayBid2[][] ={
                {1,2,3,4},
                {10,20,30,40}
        };

        for(int i = 0 ; i < arrayBid.length ; i++ ){

            //System.out.println("valor de i: " + i);

            for (int j = 0 ; j < arrayBid[i].length ; j++){

                System.out.println("valor de i: " + i +  ", j: " + j + " = " + arrayBid[i][j]);
            }
        }

        int enteros[] = new int[100]; // en memoria 100 * 2^32 bytes

       String nombres2[] = {"Pepe", "Juan"};
        nombres2[0] = "Victor";
        nombres2[1]= "Paco";

        for(String nombre : nombres2){
            System.out.println(nombre);
        }


        System.out.println("----------------------------------------------");

        //Vectores, son como Arrays pero no tienen un tamaño fijo ya que se ajustan  a los datos que tengamos
        //son arrays arrays que cuando sobrepasan su capacidad copia los valores en uno nuevo con una capacidad
        //mayor, destruyendo el anterior (multiples de mi valor inicial: default 10 y podemos especificar el incremento que se suma a
        // la capacidad actual), lo malo esque la accion de copiarlo en el array nuevo es muy costoso y mas cuando escala mucho
        // "copiar un array de 1millon se crea uno de 2 millones"
        //entonces mientras se copia tenemos 3 millones y encima copiandose, incrementa pero no se reduce

        Vector<Integer> vector = new Vector<>(15,10);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);

        System.out.println("datos del vector; " +vector);
        vector.remove(3);
        System.out.println("datos del vector; " +vector);
        System.out.println("Vecot tamaño: " + vector.size() + " y capacidad: " + vector.capacity());


        Vector<Integer> vector2 = new Vector<>(5,10);
        vector2.add(1);
        vector2.add(2);
        vector2.add(3);
        vector2.add(4);
        vector2.add(5);

        boolean resultadovectorequals = vector.equals(vector2);
        System.out.println("son iguales? :" + resultadovectorequals); //no son por el remove


        //Formas de recorrer los vectores
        System.out.println("------------------------------");

        for (int i = 0; i < vector.size(); i++){

            if(i % 2 == 0){
                vector.remove(i);
                // si eliminamos una valor luego no queremos acceder al elemento por eso continue
                continue;
            }
            System.out.println("Valor es: " + vector.get(i) + " en posicion i: " + i);
        }

        for ( int vectorval : vector2){
            //System.out.println("valor actual en el vector: " + vectorval);
        }

        System.out.println("Capacidad actual: " + vector.capacity());
        vector.trimToSize();
        System.out.println("Trim capacity, ajustar a los elementos actuales: " + vector.capacity());



    }
}
