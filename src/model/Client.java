

package model;

import java.util.ArrayList;

public class Client {
	
	// Attributes
  
   
    private String name;
	private int id;
	private String address;
	private int cellphone;

	

	
	 
	 //Methods
	 	 
		 
	public Client(String name, int id, String address, int cellphone) {
	
		this.name = name;
		this.id = id;
		this.address = address;
		this.cellphone = cellphone;
		
	}
	
		
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
		
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}	
		
	public String getAddress() {
		return address;
	}
	 	 
	public void setAddress(String address) {
		this.address = address;
	}	
	
	public int getCellphone() {
		return cellphone;
	}
	
	public void setCellphone(int cellphone) {
		this.cellphone = cellphone;
	}	
		
		
	public ArrayList<Pet> getPets(){
	 return pets;
	}
	
	public void setPets(ArrayList<Pet> pets){
	 this.pets = pets;
	}

	public void addPet(ArrayList<Pet> newPets ){
	pets = newPets;

	}	
		
		
	
	
	}



