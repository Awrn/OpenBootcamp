package com.alvarowagner;

public class Main {

    public static void main(String[] args) {

        float articulo1 = 3.75f;
        float articulo2 = 2.12f;
        float articulo3 = 6.55f;
        float iva = 21;

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
