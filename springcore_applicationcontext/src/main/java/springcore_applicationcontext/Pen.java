package springcore_applicationcontext;

import org.springframework.stereotype.Component;

//@Component is used to mark a class as component class.
//Ioc container creates object for component classes.
//@Component annotation should be used above the classname.
//@Component is a class-level annotation.
//@Component annotation is used to specify PoJo class to the Ioc container(Application Context).
//In Application Context, @Component will be used instead of <bean> tag. 

@Component
public class Pen {
	
	public Pen() {
		System.out.println("Pen constructor is invoked");
	}
	
	public void work() {
		System.out.println("Pen working perfectly fine");
	}

}
