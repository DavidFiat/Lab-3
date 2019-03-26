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
	
	 public MedicalRecord(String symptom, String diagnostic, Date date, Room room) {
	
		this.symptom = symptom;
		this.diagnostic = diagnostic;
		this.date = date;
		this.room = room;
	 }
		
	public String getSymtom() {
		String message1=symptom;
		return message1;
	}
	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}
	
	public String getDiagnostic() {
		return diagnostic;
	}
	public void setDiagnostic(String diagnostic) {
		this.diagnostic = diagnostic;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Room getRoom(){
		return room;
	} 
	
	public void setRoom(Room room ) {
		this.room = room;
	}
	
		
		
		/*
			

    public String showDragon(){
		String message1 ="";
		
			
	        message1+= ("__________________________________________"+"\n");	
			message1+= ("                  Hello                   "+"\n");	
			message1+= ("My name is "+getName()+" " +"the dragon "+"\n");
			message1+= ("My weight is "+getWeight()+" "+"Kg"+"\n");
			message1+= ("My height is "+getHeight()+" "+"m"+"\n");
			message1+= ("I am a "+getSex()+"\n");
			message1+= ("I am "+getBloodType()+"\n");
			message1+= ("I was born on "+date1.getBorn()+"\n");
			message1+= ("And my BMI is "+getBmi()+"\n");
			message1+= ("__________________________________________"+"\n");	
		
		return message1;
		
}





    public String vowelDragon(){
		 
		 
		
		int t= getName().length();
		String message5="";
		
		--t;
		
		
	
		
		if((getName().charAt(t))==('a')||
		   (getName().charAt(t))==('e')||
		   (getName().charAt(t))==('i')||
		   (getName().charAt(t))==('o')||
		   (getName().charAt(t))==('u')||
		   (getName().charAt(t))==('A')||
		   (getName().charAt(t))==('E')||
		   (getName().charAt(t))==('I')||
		   (getName().charAt(t))==('O')||
		   (getName().charAt(t))==('U')){
			
			if(getSex()!="male"){
			
		message5= "Dragon "+getName()+ " "+ "ends her name with a vocal" ;
			
		    }
			
			else{
			
        message5= "Dragon "+getName()+ " "+ "ends his name with a vocal" ;			
		}
		}	

        if((getName().charAt(0))==('a')||
		   (getName().charAt(0))==('e')||
		   (getName().charAt(0))==('i')||
		   (getName().charAt(0))==('o')||
		   (getName().charAt(0))==('u')||
		   (getName().charAt(0))==('A')||
		   (getName().charAt(0))==('E')||
		   (getName().charAt(0))==('I')||
		   (getName().charAt(0))==('O')||
		   (getName().charAt(0))==('U')){
			
			if(getSex()!="male"){
			
		message5= "Dragon "+getName()+ " "+ "starts her name with a vocal" ;
			
		    }
			
			else{
			
        message5= "Dragon "+getName()+ " "+ "starts his name with a vocal" ;			
		}
		}	
		
		if(((getName().charAt(t))==('a')||
		    (getName().charAt(t))==('e')||
			(getName().charAt(t))==('i')||
			(getName().charAt(t))==('o')||
			(getName().charAt(t))==('u')||
			(getName().charAt(t))==('A')||
			(getName().charAt(t))==('E')||
			(getName().charAt(t))==('I')||
			(getName().charAt(t))==('O')||
			(getName().charAt(t))==('U'))&&
		   ((getName().charAt(0))==('a')||
		    (getName().charAt(0))==('e')||
			(getName().charAt(0))==('i')||
			(getName().charAt(0))==('o')||
			(getName().charAt(0))==('u')||
			(getName().charAt(0))==('A')||
			(getName().charAt(0))==('E')||
			(getName().charAt(0))==('I')||
			(getName().charAt(0))==('O')||
			(getName().charAt(0))==('U'))){
			
			if(getSex()!="male"){
			
		message5= "Dragon "+getName()+ " "+ "starts and ends her name with a vocal" ;
			
		    }
			
			else{
			
        message5= "Dragon "+getName()+ " "+ "starts and ends his name with a vocal" ;			
		}
		}	
		
		
		return message5;
		}
		
		*/
}