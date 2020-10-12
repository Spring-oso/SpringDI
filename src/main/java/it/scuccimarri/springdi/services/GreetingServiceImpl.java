package it.scuccimarri.springdi.services;

import org.springframework.stereotype.*;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
