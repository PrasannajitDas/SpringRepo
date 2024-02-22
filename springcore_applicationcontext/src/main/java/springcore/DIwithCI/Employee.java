package springcore.DIwithCI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	int id;
	String name;
	String role;
	
	public Employee(@Value("1") int id,@Value("Girija") String name,@Value("Java Developer") String role) {
		this.id=id;
		this.name=name;
		this.role=role;
	}
	
	

}
