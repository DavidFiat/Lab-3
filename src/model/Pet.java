

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

	
		
	//Relations
	 
	 private MedicalRecord medRecord;
	 
	 
	 //Methods
	 
	 
	 public Pet(String name, String type, int age, double weight, MedicalRecord medRecord) {
	
		this.name = name;
		this.type = type;
		this.age = age;
		this.weight = weight;
			
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
	
	public MedicalRecord getMedicalRecord() {
		return medRecord;
	}
	public void setMedRecord(MedicalRecord medRecord) {
		this.medRecord = medRecord;
	}	
	
	
	
			
			
			
			
	

		
		
	}
	  
	
	
	
	
	
	
	
