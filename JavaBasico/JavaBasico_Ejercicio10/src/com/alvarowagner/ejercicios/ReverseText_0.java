package com.alvarowagner.ejercicios;

public class ReverseText_0 {

    public static void main(String[] args) {

        System.out.println(reverse("Hello World"));

    }



    public static String reverse(String texto){

        String reversed = "";

        for (int i = texto.length() -1  ; i >= 0 ; i--){

            reversed += texto.charAt(i);

        }

        return reversed;
    }

}
