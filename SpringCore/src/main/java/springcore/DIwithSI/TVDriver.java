package springcore.DIwithSI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TVDriver {
	public static void main(String[] args) {
		ClassPathResource cpr=new ClassPathResource("MyCore.xml");
		BeanFactory bf=new XmlBeanFactory(cpr);
		TV tv=(TV)bf.getBean("mytv");
		Remote r=tv.getR();
		r.work();
	}

}
