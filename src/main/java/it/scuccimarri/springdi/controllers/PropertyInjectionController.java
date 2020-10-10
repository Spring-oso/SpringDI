package it.scuccimarri.springdi.controllers;

import it.scuccimarri.springdi.services.*;

public class PropertyInjectionController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
