package springcore.DIwithCI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MobileDriver {
	public static void main(String[] args) {
		ClassPathResource cpr=new ClassPathResource("CI.xml");
		BeanFactory bf=new XmlBeanFactory(cpr);
		Mobile1 mobile=(Mobile1) bf.getBean("momob");
		System.out.println(mobile.getId());
		System.out.println(mobile.getBrand());
		System.out.println(mobile.getPrice());
		System.out.println("------------------------------");
		
		Sim sim=mobile.getSim();
		System.out.println(sim.getId());
		System.out.println(sim.getBrand());
		System.out.println(sim.getType());
	}

}
