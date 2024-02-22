package springcore.Beandefinition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "springcore.Beandefinition")
public class ClassConfig {
	
	@Bean
	public B getB() {
		return new B();
	}

}


//@Bean used to get the instance of third party classes(classes which does not belong in spring framework)  (OR)
//@Bean is used to get instance of the classes which are not annotated with @Comonent.
//@Bean is majorly used to get the instance of inbuilt or pre-defined classes.
//@Bean is used to get the object of the classes which are not annotated with @component.
//Apart from spring framework all classes are not annotated with @component.
//@Bean is a method-level annotation, can only be used for methods .

//@Configuration specifies the source of bean definition to the ioc container
//@Configuration specifies ioc container that this class is a source of bean-definition.
//when a class is not annotated with @Component,@Autowared  sends request to @Configuraton annotated class.
//Then ioc container will get object from @Bean annotated method and store in @Autowared annotated Dependency.
//All these happens implicitly.

//whenever we dont provide bean id bydefault class name is considered as bean id.
//when we have multiple methods with same return type, we will use bean-id to differentiate different @bean.
