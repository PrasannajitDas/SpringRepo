package springcore.DIwithVI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
	@Autowired
	Battery battery;

}

//@Autowired annotation is used to achieve automatic dependency injection.
//We can use @Autowired annotation only if the class(dependency) is component class.