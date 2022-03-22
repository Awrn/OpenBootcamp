package com.alvarowagner;

import java.util.Scanner;

public class EmpleadoConsoleIn {


    public Empleado createEmpleado  (){

        Empleado empleado = new Empleado();

        Scanner sc = new Scanner(System.in);

        System.out.println("introduce nombre");
        empleado.nombre = sc.nextLine();
        System.out.println("introduce edad");
        empleado.edad = sc.nextInt();
        System.out.println("introduce salario");
        empleado.salario = sc.nextInt();
        System.out.println("introduce alta (true/false)");
        empleado.alta = sc.nextBoolean();

        return empleado;
    }

    public void editEmpleado  (Empleado empleado){

        Scanner sc = new Scanner(System.in);

        System.out.println("Quieres editar el nombre Si/No ");
        if(sc.nextLine().equals("Si")){
            System.out.println("Introduce el nombre:");
            empleado.nombre = sc.nextLine();
        }

        System.out.println("Quieres editar la edad Si/No ");
        if(sc.nextLine().equals("Si") ){
            System.out.println("Introduce la edad:");
            empleado.edad = sc.nextInt();;
        }

        System.out.println("Quieres editar el salario Si/No ");
        if(sc.nextLine().equals("Si")){
            System.out.println("Introduce el salario:");
            empleado.salario =  sc.nextInt();;
        }

        System.out.println("Quieres editar el alta Si/No ");
        if(sc.nextLine().equals("Si")){
            System.out.println("Introduce el alta true/false:");
            empleado.alta =  sc.nextBoolean();;
        }

    }




}
