

package ui;
  
import model.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	private Veterinary vet1;
	private Scanner reader;
	
	
	
	public Main(){
		
		init();
		reader = new Scanner (System.in);
 
	}
	
	
	
	public static void main(String[] args) {

		Main m = new Main();
		m.initDate();
		m.showMenu();


			
		
	}
		
	/** 
	*Description This method creates the test values for each object.
	*post: The test values are saved in the program for prove other methods.
	*/
		
		
		
		public void init(){
		
	
	
		vet1 = new Veterinary("My little pet");
		


	}
	
	
	
	/**
	*Description This method ask to the client and save the actual date.
	*pre: The day, the month and the year are given in numbers.
	*pre: None of the data have a zero at the beginning.
	*post: The current date is saved in the program.
	*/
				
    public void initDate(){
		
				System.out.println ("\n \n");		
				System.out.println ("Type actual day \n");
	            int day = reader.nextInt();
	            System.out.println ("Type actual month \n");
	            int month = reader.nextInt();
	            System.out.println ("Type actual year \n");
	            int year = reader.nextInt();
				Date actual = new Date (day,month,year);
				vet1.setCurrentDate(actual);
				System.out.println (""+actual.getDay()+"/"+actual.getMonth()+"/"+actual.getYear());
				showMenu();
	}
	
	
	
	/**
	*Description This method shows a menu with all the options the client can select.
	*pre: The option must be a number.
	*post: The options selected are showed and the program is modified by the client.
	*/
	
	
	
	
	public void showMenu(){
		
		int option = 0;
		while (option != 11){
			

			
					
			
		System.out.println("                          ------------------------------------------------------------------- ");	
		System.out.println("                         |                  Welcome to Mi Pequeña Mascota.                   |");	
		System.out.println("                          ------------------------------------------------------------------- ");	
		System.out.println("                         |              Please select one of the choices below.              |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |  1.To register a new client and hospitalize one of his/her pet.   |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |                       2. To discharge a pet.                      |");	
		System.out.println("                         |-------------------------------------------------------------------|");
		System.out.println("                         |                  3. To see a room's availability.                 |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |                   4. To register a new medicine.                  |");		
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |                     5. To add a medical record.                   |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |                   6. To see all medical records.                  |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |                      7. To see a pet's data.                      |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |                    8. To see the total price.                     |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |              9. To see hospitalization's earnings.               |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |               10. To see in which room is an animal.              |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |                         11. To exit.                              |");	
		System.out.println("                          -------------------------------------------------------------------"+"\n"+"\n");
		
			
			
		option = reader.nextInt();	
			
			
		  switch (option){
              
               case (1):
			   
			 
				
				
				break;
				
			
			   case (2):
			   

			   


				
				/* case (3):
				
			 
				  
				case (4):
				
		
			  
			   case (5):
			   
			  

				
				case(6):
				
			
				case (7):
				
				
				case (8):
				
			
				case (9):
				
			
				
				case (10):
				
				
			
				
				*/
				
				default :
				
				System.out.println("Please choose a number between 1-11");
			    break;
				
				
			}
		
		
				
		

			
		}
				
			
	}
	
	
	
	
	


	}





