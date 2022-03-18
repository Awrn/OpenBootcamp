package com.alvarowagner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);


        System.out.println("Anade precio articulo1: ");
        float articulo1 = scan.nextFloat();
        System.out.println("Anade precio articulo2: ");
        float articulo2 = scan.nextFloat();
        System.out.println("Anade precio articulo3: ");
        float articulo3 = scan.nextFloat();
        System.out.println("Anade IVA: ");
        float iva = scan.nextFloat();

        float totalArticulos = Total(articulo1,articulo2,articulo3) ;

        System.out.println("Total sin IVA: " + totalArticulos);



        float ivaCalculado = TotalMasIVA(totalArticulos,iva);

        System.out.println("Total con IVA: " + ivaCalculado );

    }

    public static float Total(float art1, float art2, float art3){

        return art1 + art2 + art3;

    }

    public static float TotalMasIVA(float total, float iva){

        return total+ ((total*iva)/100);

    }



}
