import java.util.Scanner;
import java.util.Random;

/**
 * @author Richy
 *
 */
public class Wren_Assignment4 {




	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		
		
		//create objects
		Scanner userInput = new Scanner(System.in);
		Random fee = new Random();
		Patient patient1 = new Patient(null, null, null, null, null, null);
		Procedure procToDo = new Procedure(null, null, null, null, null, null, null, null, 0, null);

		
		// TODO Auto-generated method stub
		
		System.out.println(" ");
		System.out.println("---Patient Appointment Manager---\n");
		
		//get information
		System.out.println("Please enter the patient's first name.");
		patient1.firstName = userInput.next();
		
		System.out.println("Please enter the patient's middle name.");
		patient1.middleName = userInput.next();
		
		System.out.println("Please enter the patient's last name.");
		patient1.lastName = userInput.next();
		
		System.out.println("Please enter the patients phone number.");
		patient1.phoneNum = userInput.next();
		
		System.out.println("Please enter the name of an emergency contact.");
		patient1.emerContName = userInput.next();
		
		System.out.println("Enter the emergency contact number");
		patient1.emerContactNum = userInput.next();
		
		System.out.println("How many procedures are being preformed on the patient?");
		int numOfProcs = userInput.nextInt();
		
		//create an array of the procedures to allow more than one
		Procedure[] procs = new Procedure[numOfProcs];
		
		for(int i = 0; i < numOfProcs; i++) {
			System.out.println("What procedure is being done?");
			procToDo.procName = userInput.next();
			procToDo.procFee = 99 + fee.nextInt(1000);
			userInput.nextLine();
			System.out.println("When will the procedure be done in the format of MM/dd/YYYY");
			String dateOP = userInput.nextLine();
			System.out.println("what is the name of the physician");
			procToDo.docName = userInput.nextLine();
			procs[i] = procToDo;
		}
			
		System.out.println("|-----------Patient Summery-----------|");
		System.out.println(" ");
		System.out.println("Patient Name: " + patient1.firstName +  " " + patient1.middleName + " " + patient1.lastName);
		System.out.println("Patient Phone number: " + patient1.phoneNum);
		System.out.println("Emergency contact: " + patient1.emerContName);
		System.out.println("Emergency contact number: " + patient1.emerContactNum);
		System.out.println(" ");
		System.out.println(" ");
		
		for(int i = 0; i < numOfProcs; i++) {
			System.out.println("Procedure: " + procs[i].procName);
			System.out.println("Procedure date: " + procs[i].procDate);
			System.out.println("Physician Name: " + procs[i].docName);
			System.out.println("Charge: " + procs[i].procFee);
			sum += procs[i].procFee;
		}
		
		System.out.println("total cost is" + sum);
		
			
			
		
				
		

	}

}
