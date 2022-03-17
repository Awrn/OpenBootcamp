package com.alvarowagner;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.nombre = "Pepo";
        cliente.edad = 20;
        cliente.telefono = 634839435;
        cliente.credito = 1234.75f;

        System.out.println("Cliente |" + "Nombre: " + cliente.nombre + ", Edad: " + + cliente.edad +  ", Telefono: " + cliente.telefono + ", Credito: " + cliente.credito);



        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Shaquete";
        trabajador.edad = 25;
        trabajador.telefono = 658603435;
        trabajador.salario = 1350.30f;

        System.out.println("Trabajador |" + "Nombre: " + trabajador.nombre + ", Edad: " + + trabajador.edad +  ", Telefono: " + trabajador.telefono + ", Credito: " + trabajador.salario);
    }

}

class Persona{

    String nombre;
    int edad;
    int telefono;

}

class Cliente extends Persona{

    float credito;
}

class Trabajador extends Persona{
    float salario;
}