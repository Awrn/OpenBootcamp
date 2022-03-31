package com.example;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {

    public Calculadora(){

        System.out.println("ejecutando contructor calculator service");
    }

    public String holaMundo() {

      return "holamundo";
    }
}
