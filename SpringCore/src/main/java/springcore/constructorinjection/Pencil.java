package springcore.constructorinjection;

public class Pencil {
	
	int id;
	String brand;
	double price;
	
	public Pencil(int id,String name,double price) {
		this.id=id;
		this.brand=name;
		this.price=price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
