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



			
		
	}
		
		public void init(){
		
	
	
		vet1 = new Veterinary("Mi Pequeña Mascota")
		


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
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |                    1.To register a new client.                    |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |                      2. To hospitalize a pet.                     |");	
		System.out.println("                         |-------------------------------------------------------------------|");
		System.out.println("                         |                       3. To discharge a pet.                      |");	
		System.out.println("                         |-------------------------------------------------------------------|");
		System.out.println("                         |                  4. To see a room's availability.                 |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |                   5. To register a new medicine.                  |");		
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |                     6. To add a medical record.                   |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |                   7. To see all medical records.                  |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |                      8. To see a pet's data.                      |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |                    9. To see the total price.                     |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |              10. To see hospitalization's earnings.               |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |               11. To see in which room is an animal.              |");	
		System.out.println("                         |-------------------------------------------------------------------|");	
		System.out.println("                         |                         12. To exit.                              |");	
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
				
				break;
			
			   
			   case (2):
			   
				System.out.println("Type the number of the kangaroo that you want to remove");
				System.out.println(""+myRelation1.nameKanga());
				int nu= reader.nextInt();
				myRelation1.removeKanga(nu);
				break;
				
				case (3):
				
			  System.out.println(myRelation1.vowelDragon());
                break;
				  
				case (4):
				
			  System.out.println(myRelation1.vowelKangaroo());
                break;
             			  
			  
			   case (5):
			   
			   System.out.println(myRelation1.showE());
                break;	

				
				case(6):
				
				System.out.println(myRelation1.showKangaroo());
				break;

				case (7):
				
				System.out.println(myRelation1.showDragon());
			    break;
				
				case (8):
				
				System.out.println(myRelation1.showDragon());
			    break;
				
				case (9):
				
				System.out.println(myRelation1.showDragon());
			    break;
				
				case (10):
				
				System.out.println(myRelation1.showDragon());
			    break;
							
				case (11):
				
				System.out.println(myRelation1.showDragon());
			    break;
				
				default :
				
				System.out.println("Please choose a number between 1-11");
			    break;
				
				
			}
		
		
				
		

			
		}
		
		
		
		
		
		
	}
	
	


	}





