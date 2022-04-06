package com.example.obrestdatajpa.controller;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

//atributos (para acceder al repository hay que crear un contructor)
    //contructores
    //get y setter
    private final Logger log = LoggerFactory.getLogger(BookController.class);
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
// opcion 2
//        return bookOpt.orElse(null);
    // return bookOpt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());


    /**
     * Metodo post, no colisiona con findAll porque son diferentes metodos HTTP: GET vs. PUT
     * @param book
     * @param headers
     * @return
     */

    // crear un nuevo libro en base de datos
    @PostMapping("/api/books")
    public ResponseEntity<Book> create(@RequestBody Book book, @RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
        // guardar el libro recibido por parámetro en la base de datos
        if(book.getId() != null) { //si se intenta crear un libro con id manda el error
            log.warn("trying to create a book with id"); //-> esto nos da mas info que el sout "para crearlo mirar arriba"
            System.out.println("trying to create a book with id");
            return ResponseEntity.badRequest().build();
        }
        log.info("Creating a Book");
        Book result = bookRepository.save(book);
        return ResponseEntity.ok(result);

    }

    // actualizar un libro existente en base de datos
    @PutMapping("/api/books")
    public ResponseEntity<Book> update(@RequestBody Book book){
        //bookRepository.findAllById();
        if(book.getId() == null){
            //si no tiene id quiere decir que existe
            log.warn("Trying to update a non existent Book");
            return ResponseEntity.badRequest().build();

        }
        if(!bookRepository.existsById(book.getId())){
            log.warn("Trying to update a non existen book");
            return ResponseEntity.notFound().build();
        }
        //proceso de actualización
        Book result = bookRepository.save(book);
        return ResponseEntity.ok(result); // el libro devuelto tiene una clave primaria
    }


    // borrar un libro en base de datos
    @DeleteMapping("/api/books/{id}")
    public ResponseEntity<Book> delete(@PathVariable Long id){

        if(!bookRepository.existsById(id)){
            log.warn("Trying to delete a non existen book");
            return ResponseEntity.notFound().build();
        }

        bookRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/api/books")
    public ResponseEntity<Book> deleteAll(){

        log.info("Deleting all Books");
        bookRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }

}