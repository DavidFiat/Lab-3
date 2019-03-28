

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
		
		
		
		
	
	/*	
		
    public String vacuneKangaroo(Date actualDate){
		
	String mess= "";
	
		return mess;
	}
	 
	 	

    public String showKangaroo(Date fecha){
		String message3="";
		 	
			 
			 message3+=en1.showKangaroo(fecha)+"\n";
			
		  	 message3+=en2.showKangaroo(fecha)+"\n";
				
			 message3+=en3.showKangaroo(fecha)+"\n";
			 
		 
		
	  return message3;
	}
	
	
	
	 public String vowelKangaroo(){
			 
		 String message48="";
		   
			  		 
			 message48+=en1.vowelKangaroo()+"\n";
						 
			 message48+=en2.vowelKangaroo()+"\n";
			 
			 message48+=en3.vowelKangaroo()+"\n";
			 
			 
			 return message48;
			 
			 
	}
	
    public String showE(){
		
		String mess="";
		
		mess+="In environment 1:"+"\n";
		mess+= en1.showE()+"\n";
		mess+="In environment 2:"+"\n";
		mess+= en2.showE()+"\n";
		mess+="In environment 3:"+"\n";
		mess+= en3.showE()+"\n";
		
		return mess;
		
		
	}
	
public String nameKanga (){
			String message = "";
			if (en1.getKan1() != null){
				message += "\n 1."+en1.getKan1().getName();
			}
			if (en1.getKan2() != null){
				message += "\n 2."+en1.getKan2().getName();
			}
			if (en1.getKan3() != null){
				message += "\n 3."+en1.getKan3().getName();
			}
			if (en2.getKan1() != null){
				message += "\n 4."+en2.getKan1().getName();
			}
			if (en2.getKan2() != null){
				message += "\n 5."+en2.getKan2().getName();
			}
			if (en2.getKan3() != null){
				message += "\n 6."+en2.getKan3().getName();
			}
			if (en3.getKan1() != null){
				message += "\n 7."+en3.getKan1().getName();
			}
			if (en3.getKan2() != null){
				message += "\n 8."+en3.getKan2().getName();
			}
			if (en3.getKan3() != null){
				message += "\n 9."+en3.getKan3().getName();
			}
			message += "\n 10.Back ";
			return message;
		}

		public String addKangaroo(Kangaroo add, int num) {
	   
		String message = "";
		   
		if(num==1) {
		message += en1.addKangaroo(add);
		}
		else if(num==2) {
		message += en2.addKangaroo(add);
		}
		else if(num==3) {
		message += en3.addKangaroo(add);
		}
		else {
				message = "Type a valid environment";
			}
			return message;
		}
	
*/
	}



