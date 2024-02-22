package springcore.Beandefinition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(ClassConfig.class);
		A a=(A)ac.getBean("a");
		B b=a.b;
		b.m1();
		
	}

}

/*
First ioc container will try to create object of A as it is annotated with @Component, but in A class B dependency is
there and annotated with @Autowired, but ioc container can't inject(ASSIGN VALUE) to B dpendency as B class is not
annotated with @Component. Later @Autowired will send request to @Configuration annotated class, there ioc container 
will search for @Bean annotated method(this method returns the object of the class(B class)
which is not annotated with @Component), now ioc container will get object of the dependency class that is declared in the Component class and
then inject the dependency which is annotated with @Autowired.


when we use @Bean inside a class that class should be annotated with @Configuration.
when class is not annotated with @component then we will use @Bean annotation and explicitly we will create a method,
which will return the object of the class which is not annotated with @Component.

*/