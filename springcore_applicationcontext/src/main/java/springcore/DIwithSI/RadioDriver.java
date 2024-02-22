package springcore.DIwithSI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RadioDriver {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Radio radio=(Radio)ac.getBean("radio");
		System.out.println(radio.getId());
		System.out.println(radio.getBrand());
		System.out.println(radio.getPrice());
	}

}
