package com.alvarowagner;

public class Main {

    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();
        EmpleadoConsoleIn createempleadofromConsole = new EmpleadoConsoleIn();

        Empleado Juanito = new Empleado("Juanito",25,2220,true);
        Empleado Maria = new Empleado("Maria",23,2300,true);
        Empleado Tangiro = new Empleado("Tangiro",21,2520,true);
        Empleado Shinichi = new Empleado("Shinichi",28,2620,false);

        //guardarEmpleados
        empleadoCRUD.save(Juanito);
        empleadoCRUD.save(Maria);
        empleadoCRUD.save(Tangiro);
        empleadoCRUD.save(Shinichi);

        //consultar empleados
        System.out.println(empleadoCRUD.findAll());

        //borrar empleados

        empleadoCRUD.delete(Maria);

        //consultar empleados
        System.out.println(empleadoCRUD.findAll());

        //ConsoleEmpleadoIn
       // empleadoCRUD.save(createempleadofromConsole.createEmpleado());

        createempleadofromConsole.editEmpleado(Juanito);




        System.out.println(empleadoCRUD.findAll());

    }
}
