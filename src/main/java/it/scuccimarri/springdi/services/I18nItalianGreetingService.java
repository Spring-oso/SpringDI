package it.scuccimarri.springdi.services;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

@Profile("IT")
@Service("i18nService")
public class I18nItalianGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Ciao Mondo - IT";
    }
}
