package model;


public class Room {
	
	// Attributes

	private String availability;

	
	//Relations
	 
	 private Pet pet;
	 
	 
	 //Methods
	
	public Room(String availability, Pet pet) {
	
		this.availability = availability;
		this.pet = pet;
	
	}
	
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	
	
	
	
	
	/*public String showDragon(){
		String message2="";
		 
			 message2+=dra1.showDragon()+"\n";
						 
			 message2+=dra2.showDragon()+"\n";
		
			 return message2;	 
		 }
	
	 public String vowelDragon(){
			 
		 String message48="";
		   
			  		 
			 message48+=dra1.vowelDragon()+"\n";
						 
			 message48+=dra2.vowelDragon()+"\n";
			 
			 
			 
			 return message48;
			 
			 
	}

*/

}
	