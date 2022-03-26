package com.alvarowagner.ejercicios;

public class Throw_7 {

    public static void main(String[] args) {

        try {
            DividePorCero(4, 0);
        }catch (Exception e){
            System.out.println("Esta mal pero en la llamada de main: " + e.getLocalizedMessage());
        }
    }

    public static int DividePorCero(int num1,int num2) throws ArithmeticException {

        int resultado = 0;
        try {

            resultado = num1/num2;

        }catch (ArithmeticException e){
            System.out.println("Esta mal");
            throw new ArithmeticException();

        }finally {
            System.out.println("Demo codigo");
        }

        return resultado;
    }

}
