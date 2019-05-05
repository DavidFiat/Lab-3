
package model;

import java.util.ArrayList;


public class MedicalRecord {
	
	// Attributes

	private String symptom;
	private String diagnostic;
	
	
	
	//Relations
	 
    private Date date;
	private Room room;
	
	//Methods
	
	
	/**
	* Constructor method for class MedicalRecord. Which is a list of the pets registered with all their attributes.
	* @param symptom is the pet's suffering..
	* @param diagnostic is the verdict given to the pet. The disease the pet has. 
	* @param date is a Gregorian date.
    * @param room  is the room where the pet is.
	*/
	
	 public MedicalRecord(String symptom, String diagnostic, Date date, Room room) {
	
		this.symptom = symptom;
		this.diagnostic = diagnostic;
		this.date = date;
		this.room = room;
	 }
		
	/**
	* This method allows to get pet's symptoms. 
	* @return pet's symptom.
	*/
		
	public String getSymtom() {
		String message1=symptom;
		return message1;
	}
	
	 /**
	* This method allows to change or add a pet's symptom.
	* pre  : the param is different to null.
	* pre: The record is already created.
	* post: Pet's symptom is changed.
	* @param symptom is the suffering of the pet
	*/
	
	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}
	
	/**
	* This method allows to get doctor's diagnostic. 
	* @return pet's symptom.
	*/
	
	public String getDiagnostic() {
		return diagnostic;
	}
	
	/**
	* This method allows to change or add a pet's diagnostic.
	* pre  : the param is different to null.
	* pre: The record is already created.
	* post: Pet's diagnostic is changed.
	* @param diagnostic is the disease of the pet
	*/
	
	public void setDiagnostic(String diagnostic) {
		this.diagnostic = diagnostic;
	}
	
	/**
	* This method allows to get the Gregorian date assigned to the client.
	* @return medical record's date.
	*/
	
	public Date getDate() {
		return date;
	}
	
	
	/**
	* This method allows to know in which room the pet is. 
	* @return pet's room.
	*/
	
	public Room getRoom(){
		return room;
	} 
	
		/**
	* This method allows to change the place of the pet.
	* pre  : the param is different to null.
	* pre: The record is already created.
	* post: Pet's room is changed.
	* @param room is where the pet is.
	*/
	
	public void setRoom(Room room ) {
		this.room = room;
	}
	
		
		
	
}