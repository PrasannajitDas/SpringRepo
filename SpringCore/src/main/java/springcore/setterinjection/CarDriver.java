package springcore.setterinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CarDriver {
	public static void main(String[] args) {
		
		ClassPathResource cpr=new ClassPathResource("core.xml");
		BeanFactory bf=new XmlBeanFactory(cpr);
		Car car=(Car)bf.getBean("mycar");
		
		System.out.println(car.getRegId());
		System.out.println(car.getBrand());
		System.out.println(car.getColor());
		
	}

}
