package com.example.obrestdatajpa.controller;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repository.BookRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpHeaders;
import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

//atributos (para acceder al repository hay que crear un contructor)
    //contructores
    //get y setter

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //CRUD  sobre la entidad Book



    //Buscar todos los libros (Lista de libros)
    //para comprobar http://localhost:8080 + el GetMapping
    @GetMapping("/api/books")
    public List<Book> findAll() {
        // recuperar y devolver los libros de base de datos

        return  bookRepository.findAll();

    }

    //buscar solo libros en case de datos segun su id
    //Se puede meter el responseEntity<El objeto>
    @GetMapping("/api/books/{id}")
    public ResponseEntity<Book> FindById(@PathVariable Long id) {

        Optional<Book> bookOpt = bookRepository.findById(id); //3413412342134124124  para poder recibir null ponemos el optional
        if(bookOpt.isPresent())
            return ResponseEntity.ok(bookOpt.get());   //este .ok quiere decir que ha salido bien    //return bookOpt.get();
        else
            return ResponseEntity.notFound().build();                                                               //return null;

        //Tambien se puede hacer  bookOpt.orElse(null) que si hay un libro lo devuelve y sino da null y asi es solo una linea
    }


    //crear un libro en base de datos
    @PostMapping("/api/books")
    public Book create(@RequestBody Book book, @RequestHeader(value = "User-Agent") String userAgent) {
        System.out.println(userAgent);
        // guardar libro recibido por parametro en al base de datos
        return bookRepository.save(book);

    }


    //actualizar un libro en base de datos

    //borrar un llibro en base de datos


}
