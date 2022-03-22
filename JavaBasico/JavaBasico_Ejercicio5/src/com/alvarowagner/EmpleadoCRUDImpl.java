package com.alvarowagner;

import java.util.List;

public interface EmpleadoCRUDImpl {

     void save(Empleado empleado);

     void delete(Empleado empleado);

     List<Empleado> findAll();

}
