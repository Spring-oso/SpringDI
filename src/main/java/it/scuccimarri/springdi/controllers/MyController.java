package it.scuccimarri.springdi.controllers;

import org.springframework.stereotype.*;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World!");

        return "Hi!";
    }
}
