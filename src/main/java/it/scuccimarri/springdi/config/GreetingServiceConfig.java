package it.scuccimarri.springdi.config;

import it.scuccimarri.springdi.services.*;
import it.scuccimarri.springdi.services.factoryexample.*;
import org.springframework.context.annotation.*;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository repository){
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Primary
    @Profile({"default", "EN"})
    GreetingExampleService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("EN");
    }

    @Bean
    @Primary
    @Profile("ES")
    GreetingExampleService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("ES");
    }

    @Bean
    @Primary
    @Profile("DE")
    GreetingExampleService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("DE");
    }
}