package it.scuccimarri.springdi.services.factoryexample;

import it.scuccimarri.springdi.services.*;

public class PrimarySpanishGreetingService implements GreetingExampleService {

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}