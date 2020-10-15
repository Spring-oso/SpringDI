package it.scuccimarri.springdi.controllers;

import it.scuccimarri.springdi.services.*;
import org.springframework.stereotype.*;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
