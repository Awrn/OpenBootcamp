package com.example.obspringdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//Se crea como un bean la interfaz para llamarla desde cualquier sitio, y hacemos extends de jpa repository y especificamos el typpo de dato y el tipo de id
public interface CocheRepository extends JpaRepository<Coche,Long> {



}
