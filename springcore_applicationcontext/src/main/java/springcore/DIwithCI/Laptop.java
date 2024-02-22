package springcore.DIwithCI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Laptop {
	
	int id;
	String brand;
	double price;

	public Laptop(@Value("1")int id,@Value("Asus") String brand,@Value("45000") double price) {
		this.id=id;
		this.brand=brand;
		this.price=price;
	}
}

/*Whenever we are trying to achieve CI with application-context, we have to use @Value annotation inside the constructor,
before the proporties of POJO class.

Now variables are getting injected by ioc container through constructor.(Constructor Injection)

*/