package springcore.DIwithCI;

public class Sim {
	
	int id;
	String brand;
	String type;
	
	public Sim(int id,String brand,String type) {
		this.id=id;
		this.brand=brand;
		this.type=type;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
