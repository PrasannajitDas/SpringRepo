package springcore.DIwithCI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TelevisionDriver {
	public static void main(String[] args) {
		ClassPathResource cpr=new ClassPathResource("CI.xml");
		BeanFactory bf=new XmlBeanFactory(cpr);
		Television television=bf.getBean("motv",Television.class);
		Remote r=television.getRemote();
		r.work();
	}

}
