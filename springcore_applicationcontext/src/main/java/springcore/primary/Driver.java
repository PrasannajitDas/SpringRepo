package springcore.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Baby baby=(Baby)ac.getBean("baby");
		baby.eat();
		
	}

}
 