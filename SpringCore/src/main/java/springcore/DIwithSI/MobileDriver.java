package springcore.DIwithSI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MobileDriver {
	public static void main(String[] args) {
		ClassPathResource cpr = new ClassPathResource("MyCore.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		Mobile mobile = (Mobile) bf.getBean("mymobile");

		Sim sim = mobile.getSim();
		System.out.println(sim.getId());
		System.out.println(sim.getName());
		System.out.println(sim.getType());
	}
}
