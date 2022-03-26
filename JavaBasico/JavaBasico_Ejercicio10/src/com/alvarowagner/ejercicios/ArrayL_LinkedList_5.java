package com.alvarowagner.ejercicios;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayL_LinkedList_5
{
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(0,"pepe");
        arrayList.add(1,"juan");
        arrayList.add(2,"pipo");
        arrayList.add(3,"crenko");

        LinkedList<String> linkedlist = new LinkedList<String>();

        for(int i = 0; i < arrayList.size(); i++){

           linkedlist.add(arrayList.get(i));

        }

        linkedlist.add("hola");

        for(String elementos : linkedlist){

            System.out.println("linkedList: " + elementos);

        }

        for(String elementos : arrayList){

            System.out.println("ArrayList: " + elementos);

        }





    }


}
