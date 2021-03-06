package it.scuccimarri.springdi;

import it.scuccimarri.springdi.controllers.*;
import it.scuccimarri.springdi.examplebeans.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.*;

@SpringBootApplication
public class SpringDiApplication {

	// Dependency injection refers to the composition of your classes
	// Inversion of Control is the runtime environment of your code
	// ie Spring Frameowkr's IoC Container
	// Spring is in control of the injection of dependencies

	// Therefore DI is how you write tour class,
	// IoC is the runtime when the inection is actually happening.
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

        I18nController i18nController = (I18nController) ctx.getBean("i18nController") ;
        System.out.println(i18nController.sayHello());

        System.out.println(" ------- Bean");
		MyController myController = (MyController) ctx.getBean("myController");
        System.out.println(myController.sayHello());

        System.out.println(" ------- Bean Factory");
        System.out.println(myController.sayAnotherHello());

        System.out.println(" ------- Property");

        PropertyInjectionController propertyInjectionController = (PropertyInjectionController) ctx.getBean("propertyInjectionController");
        System.out.println(propertyInjectionController.getGreeting());

        // No bean named 'propertyInjectionController' available
        // because you have to define @Controller

        // Then if you put this annotation you will have a NullPointerException
        // because the service inside does not have the annotation @AutoWired

        // You have to put the annotation @Service on the class GreetingServiceImpl

        System.out.println(" ------- Setter");

        SetterInjectionController setterInjectionController = (SetterInjectionController) ctx.getBean("setterInjectionController");
        System.out.println(setterInjectionController.getGreeting());

        // It does not work because you have to put
        // @Controller on the class and @Autowired on the setter

        System.out.println("--------- Constructor");

        ConstructorInjectionController constructorInjectionController = (ConstructorInjectionController) ctx.getBean("constructorInjectionController");
        System.out.println(constructorInjectionController.getGreeting());

        // YOu have to put @Controller on the class and
        // @Autowired is not necessary because on the constructor is optional
        // from Spring 4.2


        System.out.println("Use external properties");
        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());

	}

}
