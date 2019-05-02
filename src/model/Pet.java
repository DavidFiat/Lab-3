

package model;


public class Pet {
	
	
	// Constants
	
	public final static String CAT = "Cat";
	public final static String DOG = "Dog";
	public final static String BIRD = "Bird";
	public final static String OTHER = "Other";
	
	// Attributes
	
	private String name;
	private String type;
	private int age;
	private double weight;
	private double height
	

	
		
	//Relations
	 
	 private MedicalRecord medRecord;
	 
	 
	 //Methods
	 
	 
	 public Pet(String name, String type, int age, double weight, double height, MedicalRecord medRecord) {
	
		this.name = name;
		this.type = type;
		this.age = age;
		this.weight = weight;
		this.height = height;
			
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType(){
		return type;
	} 
	
	public void setType(String type ) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
    }
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
    }
	
	public MedicalRecord getMedicalRecord() {
		return medRecord;
	}
	public void setMedRecord(MedicalRecord medRecord) {
		this.medRecord = medRecord;
	}	
	
	
	
	/**
	Description This method allows to calculate the body mass index for a pet.
	*pre: The pet was created before and its attributes height and weight are not null neither height must be zero.
	*post: The BMI is calculated.
	*@return The pet body mass index. Returns -1 if the height is zero  due to the division on zero does not exist.
	*/
		
	public double bodyMassIndex(){
		
	 double bodyMassIndex = ((getWeight())/(getHeight()*getHeight()));
		
	return bodyMassIndex;	
		
	}	
			
			
	

		
		
	}
	  
	
	
	
	
	
	
	
