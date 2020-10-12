package it.scuccimarri.springdi.services;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

@Profile("ES")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World! - EN";
    }
}
