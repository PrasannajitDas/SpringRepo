package springcore.DIwithSI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Radio {
	
	private int id;
	private String brand;
	private double price;
	
	public int getId() {
		return id;
	}
	@Value("101")
	public void setId(int id) {
		this.id=id;
	}

	public String getBrand() {
		return brand;
	}
	@Value("Prada")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}
	@Value("1000")
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
