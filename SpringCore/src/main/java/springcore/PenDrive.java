package springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PenDrive {
	public static void main(String[] args) {
		ClassPathResource cpr=new ClassPathResource("core.xml");//now our ClassPathResource has details of POJO classes, now we have to provide this to BeanFactory.
		BeanFactory bf=new XmlBeanFactory(cpr); //creating object of implimenting class(XmlBeanFactory), bcz BeanFactory is an interface.
//		Now internally we are passing POJO class information internally to the BeanFactory.
		
		
//		Ioc container doesn't create object for POJO class bydefault. It will create object when it is requested by the programmer.
//		for creating object we will take help of getBean("Key of pojo class"), return type is Object so downcast.
		Pen p=(Pen) bf.getBean("mypen");//deafult constructor will be invoked internally.
		p.work();
	}
}
