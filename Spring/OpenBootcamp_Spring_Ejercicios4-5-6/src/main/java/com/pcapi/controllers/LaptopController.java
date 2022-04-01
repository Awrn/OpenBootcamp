package com.pcapi.controllers;

import com.pcapi.entities.Laptop;
import com.pcapi.repositories.LaptopRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController  {

    //Atributos
    private LaptopRepo laptoprepo;

    //Contructor
    public LaptopController(LaptopRepo laptoprepo) {
        this.laptoprepo = laptoprepo;
    }


    //Metodos
    //1.findAll

    @GetMapping("/api/laptops")
    public List<Laptop> findAll() {
        return laptoprepo.findAll();
    }

    @GetMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable Long id) {

        Optional<Laptop> laptopOpt = laptoprepo.findById(id);
            return laptopOpt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/api/laptops")
    public Laptop create(@RequestBody Laptop laptop, @RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
        // guardar el libro recibido por parámetro en la base de datos
        return laptoprepo.save(laptop);
    }



}
