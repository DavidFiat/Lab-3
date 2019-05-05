

package model;


public class Medicine {
	
	// Attributes

	private String name;
	private double dose;
	private double price;
	private String frequency;
	
	
	
	//Methods
	
	/**
	* Constructor method for class Medicine. Which is a veterinary product.
	* @param name is a medicine's name.
	* @param dose is the quantity of medicine the client requires. 
	* @param price is the medicine's price for an specific quantity of medicine.
    * @param frequency  is the quantity of medicine the client has to consume on an specific time interval.
	*/
		
	public Medicine(String name, double dose, double price, String frequency) {
	
		this.name = name;
		this.dose = dose;
		this.price = price;
		this.frequency = frequency;

	}
	
	/**
	* This method allows to get a medicine's name. 
	* @return Medicine's name.
	*/
	
	public String getName() {
		return name;
	}
	
    /**
	* This method allows to change medicine's name.
	* pre  : the param is different to null.
	* pre: The medicine is already created.
	* post: Medicine's name is changed.
	* @param name is the name given to the medicine.
	*/

	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	* This method allows to get a medicine's dose. 
	* @return Medicine's dose.
	*/
	
	public double getDose() {
		return dose;
	}
	
	  /**
	* This method allows to change medicine's dose.
	* pre  : the param is different to null.
	* pre: The medicine is already created.
	* post: Medicine's dose is changed.
	* @param dose is the specific dose given for a medicine.
	*/

	
	public void setDose(double dose) {
		this.dose = dose;
	}
	
	/**
	* This method allows to get a medicine's price. 
	* @return Medicine's price.
	*/
	
	public double getPrice() {
		return price;
	}
	
	/**
	* This method allows to change medicine's price based on an specific dose.
	* pre: The param is different to null.
	* pre: The medicine is already created.
	* post: Medicine's price is changed.
	* @param price is the price given to the medicine.
	*/

	
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	* This method allows to get a the frequency of how often does the client to consume a medicine. 
	* @return Medicine's frequency.
	*/
	
	public String getFrequency() {
		return frequency;
	}
	
	/**
	* This method allows to change medicine's frequency.
	* pre: The param is different to null.
	* pre: The medicine is already created.
	* post: Medicine's frequency is changed.
	* @param frequency is the frequency given to the medicine by a doctor.
	*/

	
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	
	
}
		
		

	
	
	
	
	

	
	
	
