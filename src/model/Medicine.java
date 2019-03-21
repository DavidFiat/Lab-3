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
	
	public double getName() {
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

	
	/*

	
	
	public String showKangaroo(Date fecha){
		String message2="";
		 
		 if (kan1!=null){
			 
			 message2+=kan1.showKangaroo(fecha)+"\n";
			
		       }
     	 if (kan2!=null){
			 
			 message2+=kan2.showKangaroo(fecha)+"\n";
			 
		 }
		 
		  if (kan3!=null){
			 
			 message2+=kan3.showKangaroo(fecha)+"\n";
			 
		 }
		 
	return message2;
    }
	
	 
	 
	 public String vowelKangaroo(){
			 
		 String message48="";
		   
			 if (kan1!=null){ 	
			 
			 message48=kan1.vowelKangaroo()+"\n";
						 
			 }			 
				
			 if (kan2!=null){
				 
			 message48+=kan2.vowelKangaroo()+"\n";

             }
			 
			 if(kan3!=null){
			 
			 message48+=kan3.vowelKangaroo()+"\n";
			 
			 }
			 
			 return message48;
			 
			 
	}
	
	        public double calculeArea(){
				
				double area=(kan1.getHeight()*8)+(kan2.getHeight()*8)+(kan3.getHeight()*8);
				
				
				return area;
				
			} 
	
	
	
	        public String showE(){
			 
			 String mess="";
			 
			if ((kan1==null)&&(kan2==null)&&(kan3==null)){
			 
			 mess+=("The water required is "+ "0 Lt "+"\n");
		     mess+=("The food required is 0 Kg "+"\n");
		     }
			 
			 else if ((kan2==null)&&(kan3==null)&&(kan1!=null)){
			 
			 mess+=("The water required is "+ (kan1.getBmi()*1.5)+" "+"Lt "+"\n");
		     mess+=("The area is "+(kan1.getHeight()*8)+" "+"m2"+"\n");
			 mess+=(("The food required is ")+kan3.getFood()+"\n");
		     }
			 
			 else if ((kan1==null)&&(kan3==null)&&(kan2!=null)){
			 
			 mess+=("The water required is "+ (kan2.getBmi()*1.5)+" "+"Lt "+"\n");
		     mess+=("The area is "+(kan2.getHeight()*8)+" "+"m2"+"\n");
			  mess+=("The food required is "+kan2.getFood()+"\n");
		     }
			 
			 else if ((kan1==null)&&(kan2==null)&&(kan3!=null)){
			 
			 mess+=("The water required is "+ (kan3.getBmi()*1.5)+" "+"Lt "+"\n");
		     mess+=("The area is "+(kan3.getHeight()*8)+" "+"m2"+"\n");
			  mess+=("The food required is "+kan3.getFood()+"\n");
		     }
			 
			 else if ((kan1!=null)&&(kan3!=null)&&kan2!=null){
				 
			mess+=("The water required is "+ ((kan1.getBmi()*1.5)+ (kan2.getBmi()*1.5)+ (kan3.getBmi()*1.5))+" "+"Lt "+"\n"); 
			mess+=("The area is "+((kan1.getHeight()*8)+(kan2.getHeight()*8)+(kan3.getHeight()*8))+" "+"m2"+"\n");	 
			 mess+=("The food required is "+(kan1.getFood()+kan2.getFood()+kan3.getFood()+"\n"));	 
			 }
	
            else if ((kan1!=null)&&(kan2!=null)&&(kan3==null)){
			 		
	        mess+=("The water required is "+ ((kan1.getBmi()*1.5)+ (kan2.getBmi()*1.5))+" "+"Lt "+"\n"); 
			mess+=("The area is "+((kan1.getHeight()*8)+(kan2.getHeight()*8))+" "+"m2"+"\n");	
	        mess+=("The food required is "+(kan1.getFood()+kan2.getFood()+" Kg"+"\n"));
	  
			}
			
			
			
			 else if ((kan1!=null)&&(kan2==null)&&(kan3!=null)){
				 
			mess+=("The water required is "+ ((kan1.getBmi()*1.5)+ (kan3.getBmi()*1.5))+" "+"Lt "+"\n"); 
			mess+=("The area is "+((kan1.getHeight()*8)+(kan3.getHeight()*8))+" "+"m2"+"\n");	
	         mess+=("The food required is "+(kan1.getFood()+kan3.getFood())+" Kg"+"\n");
			}
			
			else if ((kan1==null)&&(kan2!=null)&&(kan3!=null)){
				
			mess+=("The water required is "+ ((kan2.getBmi()*1.5)+ (kan3.getBmi()*1.5))+" "+"Lt "+"\n"); 
			mess+=("The area is "+((kan2.getHeight()*8)+(kan3.getHeight()*8))+" "+"m2"+"\n");	
	         mess+=("The food required is "+kan2.getFood()+kan3.getFood()+" Kg"+"\n");
			}
	 
	 
	 
			 return mess;
			 
			 
		 }
		
		public String addKangaroo(Kangaroo add) {
		String message = "";
		
		if(kan1==null || kan2== null || kan3 ==null) {
		
	

			if(add.getSex().equals("Male")){
				
				
					
				message += "There is already a male in this environment.";
				
			
			}	
		
			if(kan1==null && add.getSex().equals("Female")) {
				kan1 = add;
				message += "The kangaroo was added";
			}
			else if (kan2==null && add.getSex().equals("Female")) {
				kan2 = add;
				message += "The kangaroo was added";
			}
			else if (kan3 == null && add.getSex().equals("Female")) {
				kan3 = add;
				message += "This kangaroo was added";
			}
			
		
		else {
			
			message += "The kangaroo was not added because this environment is full";
		}
		}
		return message;
	}
	
		public boolean fullMale() {
		boolean full = false;
		
		if(kan1!=null && kan1.getSex().equals("Male")) {
			full = true;
		}
		else if(kan2!=null && kan2.getSex().equals("Male")) {
			full = true;
		}
		else if(kan3!=null && kan3.getSex().equals("Male")) {
			full = true;
		}
		return full;
	}


*/


	
}
		
		

	
	
	
	
	

	
	
	
