package springcore.setterinjection;

public class Company {

	private int id;
	private String name;
	private String brandValue;
	private String ceo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrandValue() {
		return brandValue;
	}

	public void setBrandValue(String brandValue) {
		this.brandValue = brandValue;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

}
