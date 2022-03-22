package com.alvarowagner;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD implements EmpleadoCRUDImpl{

    List<Empleado> baseEmpleados = new ArrayList<>();

    public void save(Empleado empleado) {
        System.out.println("saveEmpleado");
        baseEmpleados.add(empleado);

    }

    public void delete(Empleado empleado) {
        System.out.println("deleteEmpleado");
        baseEmpleados.remove(empleado);

    }

    public  List<Empleado> findAll() {
        System.out.println("findAll");
        return baseEmpleados;

    }

}
