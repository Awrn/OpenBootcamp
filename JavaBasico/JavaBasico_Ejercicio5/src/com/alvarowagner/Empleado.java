package com.alvarowagner;

public class Empleado {

    //Atributos
    String nombre;
    int edad;
    double salario;
    boolean alta;

    //Constructores
    Empleado(){

    }

    Empleado(String nombre, int edad, double salario, boolean alta){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.alta = alta;
    }


    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                ", alta=" + alta +
                '}';
    }
}
