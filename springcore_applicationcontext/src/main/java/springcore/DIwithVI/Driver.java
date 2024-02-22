package springcore.DIwithVI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springcore.variableinjection.ClassConfiguration;

public class Driver {
	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(ClassConfiguration.class);
		Mobile mobile=(Mobile)ac.getBean("mobile");
		Battery bat=mobile.battery;
		bat.work();
		
	}

}
