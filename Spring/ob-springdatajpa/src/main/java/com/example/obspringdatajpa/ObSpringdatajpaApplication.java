package com.example.obspringdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringdatajpaApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(ObSpringdatajpaApplication.class, args);
		CocheRepository repository = context.getBean(CocheRepository.class);

		System.out.println("find");
		System.out.println(repository.count());

		//Crear y almeacenar un coche en base de datos
		Coche toyota = new Coche(null,"Toyota","Prius", 2010);
		repository.save(toyota);

		System.out.println("El num de coches en base de datos es: " + repository.count());

		//recuperar coche por id
		System.out.println(repository.findAll());
	}

}
