package it.scuccimarri.springdi.controllers;

import it.scuccimarri.springdi.services.*;
import it.scuccimarri.springdi.services.factoryexample.*;
import org.springframework.stereotype.*;

@Controller
public class MyController {

    private final GreetingService greetingService;
    private final GreetingExampleService greetingExampleService;

    public MyController(GreetingService greetingService, GreetingExampleService greetingExampleService) {
        this.greetingService = greetingService;
        this.greetingExampleService = greetingExampleService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    public String sayAnotherHello() {
        return greetingExampleService.sayGreeting();
    }
}
