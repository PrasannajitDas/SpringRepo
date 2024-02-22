package springcore.DIwithCI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {
	int id;
	String name;
	Employee emp;
	
	public Company(@Value("1") int id,@Value("EcoLab") String name,@Autowired Employee emp) {
		this.id=id;
		this.name=name;
		this.emp=emp;
	}

}
