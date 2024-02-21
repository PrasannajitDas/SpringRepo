package springcore_applicationcontext;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "springcore_applicationcontext")
public class ClassConfiguration {

}


//@ComponentScan is used to specify package name to the ioc container
//@ComponentScan is used to specify the location of PoJo classes to the ioc container
//In @ComponentScan, we can specify the prefix word of the package name instead of writing the complete package name.

/*i.e.(here we don't need to provide full package-name, just can provide initial-name,now it will search for the package name
 * in the whole project having same initial name, if it is present then ioc container will create object for all the 
 * pojo classes.)
*/
//if pcg name is com.jsp, provide initial name
//if pcg name is com_jsp, provide whole name(ncz it is taken as a single word)