package springcore.primary;

import org.springframework.stereotype.Component;

@Component
public class Vanilla implements IceCreame{

	public void taste() {
		System.out.println("Vanilla is tasty");
	}

}
