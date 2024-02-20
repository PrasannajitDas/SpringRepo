package springcore.constructorinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PencilDriver {
	public static void main(String[] args) {
		ClassPathResource cpr=new ClassPathResource("CI.xml");
		BeanFactory bf=new XmlBeanFactory(cpr);
		Pencil p=(Pencil)bf.getBean("mypencil");
		Pencil p1=bf.getBean("mypencil",Pencil.class);
		
		System.out.println(p);
		System.out.println(p1);
		
//		System.out.println(p.getId());
//		System.out.println(p.getBrand());
//		System.out.println(p.getPrice());
	}
}
