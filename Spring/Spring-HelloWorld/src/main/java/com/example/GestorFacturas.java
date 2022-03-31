package com.example;

public class GestorFacturas {
    //Atributos
    CalculatorService calculadora;
    String nombre;

    public GestorFacturas(CalculatorService calculadora, String nombre) {
        System.out.println("constructor gestorfacturas");
        this. calculadora = calculadora;
        this.nombre = nombre;
    }
}
