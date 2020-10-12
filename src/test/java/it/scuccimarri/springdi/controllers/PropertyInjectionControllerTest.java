package it.scuccimarri.springdi.controllers;

import it.scuccimarri.springdi.services.*;
import org.junit.jupiter.api.*;

// This is an example of manual property injection
class PropertyInjectionControllerTest {

    PropertyInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectionController();
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}