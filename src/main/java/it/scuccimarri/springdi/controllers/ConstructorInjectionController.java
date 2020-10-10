package it.scuccimarri.springdi.controllers;

import it.scuccimarri.springdi.services.*;

/* Types of Dependency Injection
    - By class properties - least preferred
        - Can be public or private properties
        - Using private properties is EVIL
    - By Setters - Area of much debate
    - By Constructor - Most Preferred
 */
public class ConstructorInjectionController {

    private final GreetingService greetingService;

    public ConstructorInjectionController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
