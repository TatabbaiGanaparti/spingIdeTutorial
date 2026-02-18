package com.example.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorldController{

@GetMapping("/")
public String getWelcome(){
    return "Hello World to Nani";
}


@GetMapping("/name")
public String getName(){
    return "Nani";
}
}
