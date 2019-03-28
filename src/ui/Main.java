

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
				
			
			   
			   case (2):
			   
				System.out.println(vet.showClients());

				System.out.println("Por favor digite la identificacion del usuario para dar de alto a su animal");
				long idClientt = reader.nextLong();
				reader.nextLine();

				System.out.println("Por favor digite el nombre de la mascota para darlo de alto");
				String nampe = reader.nextLine();

				System.out.println("UNA VEZ REALIZADA ESTA ACCION, SE SACARA AL ANIMALITO DEL CUARTO");

				System.out.println("Digite el dia de ingreso");
				int dai = reader.nextInt();
				reader.nextLine();

				System.out.println("Digite el mes de ingreso");
				int mon = reader.nextInt();
				reader.nextLine();

				System.out.println("Digite el año de ingreso ");
				int yea = reader.nextInt();
				reader.nextLine();

				HistorialDated dateIn = new HistorialDated(dai, mon, yea);

				System.out.println("Digite el dia de salida");
				int dai2 = reader.nextInt();
				reader.nextLine();

				System.out.println("Digite el mes de salida");
				int mon2 = reader.nextInt();
				reader.nextLine();

				System.out.println("Digite el año de salida ");
				int yea2 = reader.nextInt();
				reader.nextLine();

				HistorialDated dateOut = new HistorialDated(dai2, mon2, yea2);

				System.out.println("Digite el nombre del dueño ");
				String nameClie = reader.nextLine();

				System.out.println("Digite el id del cliente");
				long idClie = reader.nextLong();
				reader.nextLine();

				System.out.println("Digite el nombre completo de la mascota");
				String namePe = reader.nextLine();

				System.out.println("Digite el sintoma del animal");
				String symp = reader.nextLine();

				System.out.println("Digite el diagnostico ");
				String diag = reader.nextLine();

				System.out.println("Digite el estado");
				boolean stat = reader.nextBoolean();
				reader.nextLine();

				System.out.println("Digite el nombre del medicamento");
				String medi = reader.nextLine();

				System.out.println("Digite la dosis");
				double dos = reader.nextDouble();
				reader.nextLine();

				System.out.println("Digite la total de dosis");
				double totaldos = reader.nextDouble();
				reader.nextLine();

				System.out.println("Digite la frecuencia del medicamento");
				int frec = reader.nextInt();
				reader.nextLine();

				Pet pet2 = principal.findPett(nameClie, idClie, namePe);

				ClinicalHistory newMedRec = new ClinicalHistory( nameClie, namePe , symp, diag, stat, dateIn,dateOut, pet2);

				Medicament medics = new Medicament(medi, dos, totaldos, frec);

				principal.hospitalizeVet(nameClie, idClie, namePe, newMedRec, medics);


				System.out.println(principal.findToHospitalize(idClientt,nampe));
				
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





