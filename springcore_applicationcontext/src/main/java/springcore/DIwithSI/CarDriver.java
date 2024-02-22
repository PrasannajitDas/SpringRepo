package springcore.DIwithSI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarDriver {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Car car=(Car)ac.getBean("car");
		Engine engine=car.getEngine();
		engine.work();
	}

}
