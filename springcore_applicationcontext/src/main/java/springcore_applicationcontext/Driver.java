package springcore_applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(ClassConfiguration.class);
		Pen pen=(Pen)ac.getBean("pen");
		pen.work();
	}
	
//	here component id is considered as bean id.
//	if class name is single word--> provide key as small case. eg-> Pen==>pen
//	if class name is multiple word--> provide key as small-big case. eg-> IceCreame(component class)==>iceCreame(bean id)

}
