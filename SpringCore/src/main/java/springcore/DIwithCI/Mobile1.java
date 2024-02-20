package springcore.DIwithCI;

public class Mobile1 {
	 int id;
	 String brand;
	 double price;
	 
	 Sim sm;
	 
	 public Mobile1(int id,String brand,double price,Sim sm) {
		 this.id=id;
		 this.brand=brand;
		 this.price=price;
		 this.sm=sm;
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

	public Sim getSim() {
		return sm;
	}

	public void setSim(Sim sm) {
		this.sm = sm;
	}
	 
	 
	
	
}
