package com.alvarowagner;

import java.io.IOException;
import java.util.Scanner;

public class ManejoDeErrores {

    //Un error es un comportamineto no esperado en el programa

    public static void main(String[] args) {

        //1-Error en timepo de ejecución: situacion que ha sucedido en la en la ejecución que hace que aborte
          // System.out.println(5/0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();



        //Try / Catch
        try{
            int resultado = num1 / num2;
            System.out.println(resultado);
        }catch(ArithmeticException e){  //si no sabemos el error que capturamos hacemos Exception e, pero es mejor poner la concreta que en este caso es la aritmetica
            System.out.println("Boom!, excepción es: " + e.getClass());

        }catch(Exception e){
            System.out.println("estoy en una excepción que no es aritmetica");

        }finally { // se va a ejecutar siempre funcione o no, es para que se vea que ha pasado por el trycatch
            System.out.println("finally");

        }

        //Trow / Throws
        try {
            divide2(4, 0);
        }catch (Exception e){
            System.out.println("AAA");
        }

        //2-Error de compilación, es cuando la sintaxix no esta bien por lo que no se puede ejecutar
            //int 1 = 0

        //3-Error logico, es cuando la logica de nuestro codigo no es correcta
        int temperature = 27;
        if(temperature >=25){ //para que haga frio deberia ser inferior a 25 (temperature >= 25)
            System.out.println("Hace frio");
        }

        //Warnings -> son cosas que no están del todo bien (código obsoleto, funsiones sin utilizar, valores sin especificar tipo..)
        // se pueden suprimir warnings con @SupressWarnings

    }

    public static int divide2 (int a, int b) throws ArithmeticException, IOException {

        int resultado = 0;
        try {
            resultado = a/b;
        }catch (ArithmeticException e){
            throw new IOException();
        }
        return resultado;

    }


}
