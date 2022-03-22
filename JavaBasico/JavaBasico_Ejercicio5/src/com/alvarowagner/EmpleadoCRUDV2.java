package com.alvarowagner;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUDV2 implements EmpleadoCRUDImpl{

    List<Empleado> empleadosMYSQL = new ArrayList<>();

    @Override
    public void save(Empleado empleado) {
        System.out.println("saveEmpleado");
    }

    @Override
    public void delete(Empleado empleado) {
        System.out.println("deleteEmpleado");
    }

    @Override
    public List<Empleado> findAll() {
        System.out.println("findAll");
        return null;
    }

}
