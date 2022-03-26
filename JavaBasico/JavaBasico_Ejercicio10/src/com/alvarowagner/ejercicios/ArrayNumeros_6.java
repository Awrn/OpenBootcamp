package com.alvarowagner.ejercicios;

import java.util.ArrayList;

public class ArrayNumeros_6 {


    public static void main(String[] args) {


        ArrayList<Integer> arrayInt = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++){

            //if((i+1)%2 == 0) {   //Se puede hacer con esto para la forma corta
                arrayInt.add(Integer.valueOf(i + 1));
            //}
        }


       for (int i = 0; i < arrayInt.size(); i++){

           if(arrayInt.get(i)%2 != 0){

               arrayInt.remove(i);

           }
       }

        System.out.println(arrayInt);

    }


}
