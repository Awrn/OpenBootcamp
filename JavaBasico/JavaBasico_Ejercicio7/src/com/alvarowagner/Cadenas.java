package com.alvarowagner;

public class Cadenas {

    public static void main(String[] args) {
	String cadena = "Hola Mundo";
    String cadenainvert = "";


        System.out.println(cadena.length());

        for(int i = cadena.length() -1; i >= 0; i--) {
            cadenainvert += cadena.charAt(i);
        }

        for(int i = 0 ; i <= (cadena.length() -1); i++){
            System.out.println(cadena.charAt(i));
        }

        System.out.println(cadenainvert.toLowerCase());
        System.out.println(cadenainvert.toUpperCase());

        System.out.println("-------------------------------");

        // Separar un texto en palabras separadas


        String cadena2 = "Hola como estan ustedes, yo aqui programando";

        System.out.println(cadena2.length());

        String cadenapalabras = "";

        for(int i = 0 ; i < (cadena2.length() ) ; i++ ){

            String characterpos= "";

            characterpos = String.valueOf(cadena2.charAt(i));

            if(characterpos.equals(" ")){

                System.out.println(cadenapalabras);
                cadenapalabras = "";

            }else{

                cadenapalabras += cadena2.charAt(i);

            }



        }
        System.out.println(cadenapalabras);


    }
}
