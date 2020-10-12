package it.scuccimarri.springdi.controllers;

import it.scuccimarri.springdi.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

/* Types of Dependency Injection
    - By class properties - least preferred
        - Can be public or private properties
        - Using private properties is EVIL
    - By Setters - Area of much debate
    - By Constructor - Most Preferred
 */
@Controller
public class ConstructorInjectionController {

    private final GreetingService greetingService;

    // Autowired is optional from Spring 4.2
    // With Qualifier you choose the implementation to inject
    public ConstructorInjectionController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
