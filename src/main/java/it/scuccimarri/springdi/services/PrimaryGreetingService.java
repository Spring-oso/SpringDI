package it.scuccimarri.springdi.services;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

// Primary annotation is used to define the main implementation that
// has to be used for the injection
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - From the Primary bean";
    }

}
