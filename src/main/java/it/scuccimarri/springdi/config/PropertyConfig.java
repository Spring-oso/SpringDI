package it.scuccimarri.springdi.config;

import it.scuccimarri.springdi.examplebeans.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.*;
import org.springframework.core.env.*;

@Configuration

// If you have more than one properties file you can use @PropertySources.
// In this annotation you can define one @PropertySource for each source.

// if you remove @PropertySource annotation, the properties are read from application.properties
// that is the standard properties file for a Spring Boot Application
@PropertySource("classpath:fakeproperties.properties")
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${frascu.username}")
    String user;

    @Value("${frascu.password}")
    String password;

    @Value("${frascu.url}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }
    @Bean
    public static PropertySourcesPlaceholderConfigurer proerties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
