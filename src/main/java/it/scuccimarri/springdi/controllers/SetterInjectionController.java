package it.scuccimarri.springdi.controllers;

import it.scuccimarri.springdi.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Controller
public class SetterInjectionController {

    private GreetingService greetingService;

    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
