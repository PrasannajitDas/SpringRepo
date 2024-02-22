package springcore.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Baby {
	
	@Autowired
	IceCreame creame;
	
	public void eat() {
		System.out.println("Baby ate icecreme");
		creame.taste();
		System.out.println("Baby stopped crying");
	}

}

//whenever we will use @Autowired annotation above reference of interface, ioc container will create object of its
//implementing class.