package com.alvarowagner;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLists {

    public static void main(String[] args) {

        //No tienen una capacidad definida
        //aqui aumenta: capacidad += capacidad * 0.5;
        //no se pueden modificar de forma recurrente 2 valores de un array list(en paralelo) "no es thread save"
        //en cambio los vectores si pueden utilizar varios threads a la vez

        ArrayList<String> lista = new ArrayList<>();

        lista.add("ElementoA");
        lista.add("ElementoB");
        lista.add("ElementoC");
        lista.add("ElementoD");

        lista.remove("ElementoB");


        System.out.println("contenido lista: " + lista);

        lista.remove(0);

        for(String nombre : lista){
            System.out.println("foreach: " + nombre);
        }

        for(int i= 0 ; i < lista.size() ; i++){

            System.out.println("For: " + lista.get(i));
        }


        System.out.println("------------------------------");

        //copar una lista en un array del que no conocemos la capacidad

        String array[] = new String[lista.size()];

        for (int i = 0; i <lista.size(); i++){

            array[i] = lista.get(i);
        }

        for(String element : array){

            System.out.println(element);
        }

        //Otra forma
        for(Object arrayObjeto : lista.toArray()){
            System.out.println(arrayObjeto.toString());
        }


        //Linked list es mas rapida modificando datos, pero es mas lento almacenando y buscando datos.
        // la linked list funciona con listas enlazadas y la arraylist utiliza arrays

        LinkedList<String> listaEnlazada = new LinkedList<>(lista); // al poner la lista en los parametros se esta haciendo un copia
        listaEnlazada.add(0,"hola");
        System.out.println("linked lista: " + listaEnlazada);



    }
}
