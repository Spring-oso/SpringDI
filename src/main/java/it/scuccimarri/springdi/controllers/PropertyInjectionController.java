package it.scuccimarri.springdi.controllers;

import it.scuccimarri.springdi.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Controller
public class PropertyInjectionController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
