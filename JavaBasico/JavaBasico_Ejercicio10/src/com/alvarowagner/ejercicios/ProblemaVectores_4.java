package com.alvarowagner.ejercicios;

import java.util.Vector;

public class ProblemaVectores_4 {



    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<Integer>();

        System.out.println("Capacidad: " + vector.capacity());
        System.out.println("Como podemos ver la capacidad es de 10");
        vector.add(0,1);
        vector.add(1,1);
        vector.add(2,1);
        vector.add(3,1);
        vector.add(4,1);
        vector.add(5,1);
        vector.add(6,1);
        vector.add(7,1);
        vector.add(8,1);
        vector.add(9,1);
        vector.add(10,1);
        vector.add(11,1);
        System.out.println("Una vez superada la capacidad default la capacidad es de: " + vector.capacity());
        System.out.println("por lo que se dobla, en el caso de hacer una vector de 1000 elementos");
        System.out.println("el problema es que se generaria un numero excesivo, acabariamos con 1.280 elementos y luego x2 si lo superamos");
        System.out.println("por eso es mejor indicar una capacidad incial y unn incremento adecuados");


    }

}
