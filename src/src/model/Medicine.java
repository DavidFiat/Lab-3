

package model;


public class Medicine {
	
	// Attributes

	private String name;
	private double dose;
	private double price;
	private String frequency;
	
	
	
	//Methods
	
	public Medicine(String name, double dose, double price, String frequency) {
	
		this.name = name;
		this.dose = dose;
		this.price = price;
		this.frequency = frequency;

	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDose() {
		return dose;
	}
	public void setDose(double dose) {
		this.dose = dose;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
	
	
}
		
		

	
	
	
	
	

	
	
	
