package it.scuccimarri.springdi.services.factoryexample;

import it.scuccimarri.springdi.services.*;

public class PrimaryGermanGreetingService implements GreetingExampleService {

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}