package it.scuccimarri.springdi.services.factoryexample;

import it.scuccimarri.springdi.services.*;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingExampleService createGreetingService(String lang) {

        switch (lang) {
            case "EN":
                return new PrimaryEnglishGreetingService(greetingRepository);
            case "DE":
                return new PrimaryGermanGreetingService(greetingRepository);
            case "ES":
                return new PrimarySpanishGreetingService(greetingRepository);
            default:
                return new PrimaryEnglishGreetingService(greetingRepository);
        }

    }
}
