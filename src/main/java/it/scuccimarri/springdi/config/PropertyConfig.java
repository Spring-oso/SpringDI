package it.scuccimarri.springdi.config;

import it.scuccimarri.springdi.examplebeans.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.context.support.*;

@Configuration
@PropertySource("classpath:fakeproperties.properties")
public class PropertyConfig {

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
