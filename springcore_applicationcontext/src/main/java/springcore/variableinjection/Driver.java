package springcore.variableinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(ClassConfiguration.class);
		
		Car car=(Car)ac.getBean("car");
		System.out.println(car.id);
		System.out.println(car.brand);
		System.out.println(car.price);
		System.out.println("--------------------------");
		
		Car car1=ac.getBean("car",Car.class);
		System.out.println(car.id);
		System.out.println(car.brand);
		System.out.println(car.price);
		
		System.out.println("-------------------------");
		System.out.println(car);
		System.out.println(car1);
		System.out.println(car==car1);
		System.out.println(car.equals(car1));
	}

}
