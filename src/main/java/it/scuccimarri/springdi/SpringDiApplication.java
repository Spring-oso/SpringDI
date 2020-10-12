package it.scuccimarri.springdi;

import it.scuccimarri.springdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

        System.out.println(" ------- Bean");
        System.out.println(myController.sayHello());

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
	}

}
