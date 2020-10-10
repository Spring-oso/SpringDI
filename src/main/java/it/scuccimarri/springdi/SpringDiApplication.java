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
	}

}
