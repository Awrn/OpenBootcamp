package com.alvarowagner;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileIn_Output {

    public static void main(String[] args) throws FileNotFoundException {


        try {
            InputStream fichero = new FileInputStream("C:/Users/Alvaro/Desktop/Repositories/OpenBootcamp/JavaBasico/JavaBasico_Ejercicio10/TestInputStream.txt");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);

            try {
                byte[] datos = new byte[5];
                int dato = ficheroBuffer.read();

                while(dato != -1){
                    System.out.print((char) dato);
                    dato = ficheroBuffer.read();

                }


            } catch (IOException e) {
                System.out.println("No puedo leer el fichero: " + e.getLocalizedMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo: " + e.getLocalizedMessage());

        }



        System.out.println("");
        boolean ok = false;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("mete dos numeros");

            try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                ok = true;
                System.out.println("los numeros son : " + a + " " +b);
            }catch (InputMismatchException e){
                System.out.println("Numeros invalidos");
            }
        }while(!ok);

        //PrintStream
        //System.out.println("cosa");
        PrintStream infoout = new PrintStream("C:/Users/Alvaro/Desktop/Repositories/OpenBootcamp/JavaBasico/JavaBasico_Ejercicio10/TestOutputStream.txt");
        infoout.println("hola");




        //copiar ficheros

        try{
            InputStream in = new FileInputStream("C:/Users/Alvaro/Desktop/Repositories/OpenBootcamp/JavaBasico/JavaBasico_Ejercicio10/TestInputStream.txt");
            byte[] contenido = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream("C:/Users/Alvaro/Desktop/Repositories/OpenBootcamp/JavaBasico/JavaBasico_Ejercicio10/TestOutputStream.txt");
            System.out.println(contenido);
            out.write(contenido);
            out.close();

        }catch (Exception e){
            System.out.println("Excepcion + " + e.getLocalizedMessage());
        }




    }


}
