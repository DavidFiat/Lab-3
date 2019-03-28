

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
		
		public void init(){
		
	
	
		vet1 = new Veterinary("My little pet");
		


	}
	
	
	
	
	
	
	

	
	
	
	
				
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
	
	
	
		
	
	
	
	public void showMenu(){
		int option = 0;
		while (option != 12){
			

			
					
			
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
			   
			   
			    System.out.println("");
				String y=reader.nextLine();
			   
			   System.out.println("Type client's name");
				String name=reader.nextLine();
				
				System.out.println("Type client's ID");
				int id = reader.nextInt();
				reader.nextLine();
				
				System.out.println("Type Client' s address");
				String address = reader.nextLine();
				reader.nextLine();
				
				
				System.out.println("Type client' s cellphone");
				int cellphone = reader.nextInt();
				
				
				
				Client add = new Client(name, id, address, cellphone);
				
				System.out.println("Type the number of pets that you have");
				int petsNumber = reader.nextInt();
				reader.nextLine();
				
				
				
				ArrayList<Pet> newPets = new ArrayList<Pet>();
				
				for(int i = 0; i < petsNumber; i++){
				System.out.println("Type animal's name");
				String name1=reader.nextLine();
				
				System.out.println("Type animal's type (DOG, CAT, BIRD, OTHER)");
				String type=reader.nextLine();
				
				
				System.out.println("Type client's age");
				int age = reader.nextInt();
				reader.nextLine();
				
				System.out.println("Type Client' s weight");
				double weight = reader.nextDouble();
				reader.nextLine();
				
								
				Pet add1 = new Pet(name1, type, age, weight);
				
				newPets.add(add1);
				vet1.addClient(add,add1);
				System.out.println("The client was added successfully with his/her pet(s)");
				}
				
				
				break;
				
			
			   

			   


				
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





