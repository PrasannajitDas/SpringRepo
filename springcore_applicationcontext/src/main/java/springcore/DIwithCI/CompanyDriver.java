package springcore.DIwithCI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CompanyDriver {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(ClassConfig.class);
		Company company=(Company)ac.getBean("company");
		System.out.println(company.id);
		System.out.println(company.name);
		
		System.out.println("-------------------------");
		
		Employee emp=company.emp;		
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.role);
	}

}

