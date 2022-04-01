package com.example.obrestdatajpa;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class ObRestDatajpaApplication {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(ObRestDatajpaApplication.class, args);
		BookRepository repository =  context.getBean(BookRepository.class);

		//CRUD
		//crear libro

		Book book1 = new Book(null,"Homo Deus","Yuval Noah",450,29.99, LocalDate.of(2018,12,1),true);
		Book book2 = new Book(null,"Homo Sapiens","Yuval Noah",460,25.99, LocalDate.of(2018,12,1),true);
		Book book3 = new Book(null,"frank","Yuval Noah",460,25.99, LocalDate.of(2018,12,1),true);
		Book book4 = new Book(null,"pep","Yuval Noah",460,25.99, LocalDate.of(2018,12,1),true);

		//almacenar un libro
		System.out.println("num libro base de datos " + repository.findAll().size());

		repository.save(book1);
		repository.save(book2);
		repository.save(book3);
		repository.save(book4);


		//recuperar todos los libros
		System.out.println("num libro base de datos " + repository.findAll().size());
		repository.findAll();

		//borrar un ribro

		repository.deleteById(1L);

		System.out.println("num libro base de datos " + repository.findAll().size());

	}

}
