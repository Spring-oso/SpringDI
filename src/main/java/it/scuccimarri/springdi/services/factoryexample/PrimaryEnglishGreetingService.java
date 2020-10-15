package it.scuccimarri.springdi.services.factoryexample;

import it.scuccimarri.springdi.services.*;

public class PrimaryEnglishGreetingService implements GreetingExampleService {

    private GreetingRepository greetingRepository;

    public PrimaryEnglishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}