package springcore.variableinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")//@Scope annotation is used to modify the scope of a bin.
public class Car {
	
	@Value("1")
	int id;
	
	@Value("Audi")
	String brand;
	
	@Value("100.0")
	double price;
	
//@Value annotation is used to provide default values by the programmer to the proporties of the pojo class.
//	@value annotation is used to specify default values.
//	How many objects we will create, the values of the properties will be same only.
}
