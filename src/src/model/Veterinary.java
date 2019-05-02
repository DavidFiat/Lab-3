

package model;

import java.util.ArrayList;


public class Veterinary {
	
	// Constants
	
	
	
	public final static int ROOMS_NUMBER = 8;
	




	// Attributes
	

	private String name;
	private Room[] rooms;
	private ArrayList<Client> clients;
	private ArrayList<MedicalRecord> medicalRecords;
	private ArrayList<Medicine> medicines2;

	
	
	 //Methods
	 
	 
	 public Veterinary(String name) {
	
		this.name = name;
		clients = new ArrayList<>();
		rooms= new Room[ROOMS_NUMBER];
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String addClient(Client newClient, ArrayList<Pet> newPets) {
		
	clients.add(newClient);
	clients.get((clients.size()-1)).addPet(newPets);
	}


	 
	 



}