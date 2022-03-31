package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //Concepto1: como obtener beans spring
        //Opcion1. Crera un objeto de forma normal
        // Calculator servvice calculadora = new calculadora

        //Opcion2. Recibir un objeto spring
        CalculatorService calculadora = (CalculatorService) context.getBean("calculadora");
        String texto = calculadora.holaMundo();
        System.out.println(texto);


        //se puede volver a obtener
        //Ojo se recupera el mismo objeto
        CalculatorService calculadora2 = (CalculatorService) context.getBean("calculadora");
        texto = calculadora.holaMundo();
        System.out.println(texto);

        //Concepto 2: cargar un bean dentro de otro bean
        GestorFacturas gestor = (GestorFacturas) context.getBean("gestorFacturas");
        System.out.println(gestor.calculadora.holaMundo());


        //Concepto 3 : scope o alcance
        // los beans por defecto son singleton, se crea el objeto y se reutiliza para toda la aplicacion
        // podemos cambiarlo a scope="prototye" en el xml si queremos que creee un nuevo oobjeto cada vez, no se utiliza casi, se suele hacer a mano.
        //Verificar que es prototype viendo como se ejecuta.
    }
}
