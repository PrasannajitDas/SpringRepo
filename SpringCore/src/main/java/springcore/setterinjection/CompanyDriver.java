package springcore.setterinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CompanyDriver {
	public static void main(String[] args) {

		ClassPathResource cpr = new ClassPathResource("core.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		Company company = (Company) bf.getBean("company");

		System.out.println(company.getId());
		System.out.println(company.getName());
		System.out.println(company.getCeo());
		System.out.println(company.getBrandValue());

	}

}
