package com.example;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GestorFacturas {
    //Atributos
    Calculadora calculadora;


    public GestorFacturas(Calculadora calculadora) {
        System.out.println("constructor gestorfacturas");
        this.calculadora = calculadora;

    }
}
