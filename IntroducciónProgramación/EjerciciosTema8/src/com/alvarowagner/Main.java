package com.alvarowagner;

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 =new Persona();

        persona1.setNombre("Pepo");
        System.out.println(persona1.getNombre());
        persona1.setEdad(23);
        System.out.println(persona1.getEdad());
        persona1.setTelefono(692278496);
        System.out.println(persona1.getTelefono());


        System.out.println("------------------------");

        persona2.setNombre("Mikeldelegrel");
        System.out.println(persona2.getNombre());
        persona2.setEdad(20);
        System.out.println(persona2.getEdad());
        persona2.setTelefono(606232456);
        System.out.println(persona2.getTelefono());


    }
}

    class Persona{

        private int edad;
        private int telefono;
        private String nombre;


        //Getter / Setters
        public int getEdad(){
            return this.edad;
        }

        public void setEdad(int edad){

            this.edad = edad;
        }


        public void setTelefono(int telefono){

            this.telefono = telefono;
        }

        public int getTelefono(){
            return this.telefono;
        }

        public void setNombre(String nombre){

            this.nombre = nombre;
        }

        public String getNombre(){
            return this.nombre;
        }


    }





