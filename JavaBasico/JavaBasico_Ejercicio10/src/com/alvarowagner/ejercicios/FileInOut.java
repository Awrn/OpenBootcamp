package com.alvarowagner.ejercicios;

import java.io.*;

public class FileInOut {

    public static void main(String[] args) {



        try {
            InputStream in = new FileInputStream("C:/Users/Alvaro/Desktop/Repositories/OpenBootcamp/JavaBasico/JavaBasico_Ejercicio10/TestInputStream.txt");
            PrintStream out = new PrintStream("C:/Users/Alvaro/Desktop/Repositories/OpenBootcamp/JavaBasico/JavaBasico_Ejercicio10/TestOutputStream.txt");

            CopyFiles(in, out);

        }catch (Exception e){
            System.out.println("CantReadFile:" + e.getLocalizedMessage());
        }
    }

    public static void CopyFiles (InputStream in, PrintStream out) throws Exception {

        try {
            byte[] contenido = in.readAllBytes();
            out.write(contenido);
            System.out.write(contenido);
            System.out.println("");

        }catch (Exception e ){
            throw new Exception();
        }finally{
            System.out.println("Close path");
        }

    }
}
