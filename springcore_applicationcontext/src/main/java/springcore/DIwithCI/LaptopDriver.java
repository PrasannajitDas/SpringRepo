package springcore.DIwithCI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaptopDriver {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(ClassConfig.class);
		Laptop laptop=(Laptop)ac.getBean("laptop");
		System.out.println(laptop.id);
		System.out.println(laptop.brand);
		System.out.println(laptop.price);
	}

}
