package model;


public class Pet {
	
	
	// Constants
	
	public final static String GATO = "Gato";
	public final static String PERRO = "Perro";
	public final static String AVE = "Ave";
	public final static String OTRO = "Otro";
	
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
	
	
	/***public String vacune(Date actual ){
		
		 
		 
		 String vacune= "";
		 double nowDate=((actual.getDay()*1)+(actual.getMonth()*12)+(actual.getYear()*365));
		 
		 if ((nowDate-date2.getDaysKangaroo())==365){
			 
			 vacune="The kangaroo needs vacune";
		 }
		 
		  if ((nowDate-date2.getDaysKangaroo())<365){
			 
			 vacune="The kangaroo does not need vacune yet";
		  }
		 
		  if ((nowDate-date2.getDaysKangaroo())>365){
			 
			 vacune="The kangaroo has a vacune already";
		 
		  }
		 
		 		 
		 return vacune;
		 
		 
		 
		 
	 }	
		
			
	 
	public String showKangaroo(Date fechita){
		String message1 ="";
		
		
	        message1+= ("__________________________________________"+"\n");	
			message1+= ("                  Hello                   "+"\n");	
			message1+= ("My name is kangaroo "+getName()+"\n");
			message1+= ("My weight is "+getWeight()+" "+"Kg "+"\n");
			message1+= ("My height is "+getHeight()+" "+"m "+"\n");
			message1+= ("I am a "+getSex()+"\n");
			message1+= ("I am "+getBloodType()+"\n");
			message1+= ("I was born on "+date2.getBorn()+"\n");
			message1+= ("And my BMI is "+getBmi()+"\n");
			message1+= (vacune(fechita)+"\n");
			message1+= (heartProblem()+"\n");
			message1+= ("___________________________________________"+"\n");	
		
		return message1;
		
		
	}
	
	
	
	 public String vowelKangaroo(){
		 
		 
		
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
             message5= "Kangaroo "+getName()+ " "+ "ends her name with a vocal" ;
		     }
			
			else{
			
             message5= "Kangaroo "+getName()+ " "+ "ends his name with a vocal" ;			
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
			
		message5= "Kangaroo "+getName()+ " "+ "starts her name with a vocal" ;
			
		    }
			
			else{
			
        message5= "Kangaroo "+getName()+ " "+ "starts his name with a vocal" ;			
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
			
		message5= "Kangaroo "+getName()+ " "+ "starts and ends her name with a vocal" ;
			
		    }
			
			else{
			
        message5= "Kangaroo "+getName()+ " "+ "starts and ends his name with a vocal" ;			
		         }
		}	
		
		
		return message5;
		}
	
	
		public String heartProblem(){
			
			String messa="";
			
			if (getWeight()<18){
				
					if((getBloodType().equalsIgnoreCase("A")||(getBloodType().equalsIgnoreCase("AB")))){
						
					messa=" This kangaroo has a low risk to suffer heart attacks";
										
					}
							
					else {
					messa="This kangaroo has a moderated risk to suffer heart attacks";
			
					}                       
										
			}
			
			if ((getWeight()>18)&&(getWeight()<25)){
				
					
						
					messa=" This kangaroo has a low risk to suffer heart attacks";
										
					     
										
			}		
			
			if (getWeight()>25){
				
				if((getBloodType().equalsIgnoreCase("A"))||(getBloodType().equalsIgnoreCase("B"))||(getBloodType().equalsIgnoreCase("O"))){
						
					messa="This kangaroo has a high risk to suffer heart attacks";
										
					}
							
				else {
					messa="This kangaroo has a moderated risk to suffer heart attacks";
			
					}                       
										
			}	
			
			
			
			
			return messa;
		
			
			
		}
         
   
	
	

			
			
			
		*/	
			
			
			
			
			
	

		
		
	}
	  
	
	
	
	
	
	
	
