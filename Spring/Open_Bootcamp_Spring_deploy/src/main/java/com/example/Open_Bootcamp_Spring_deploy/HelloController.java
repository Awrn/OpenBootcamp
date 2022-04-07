package com.example.Open_Bootcamp_Spring_deploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    //ACCEDER A VALORES DEL APPLICATION PROPERTIES
    @Value("${app.varexample}")
    String message;


    @GetMapping("/hola")
    public String enviarSaludo(){
        System.out.println(message);
        return "Hello users!";

    }

}
