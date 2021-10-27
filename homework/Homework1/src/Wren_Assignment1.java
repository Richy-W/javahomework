/**
 * 
 */

/**
 * @author Richy
 *
 */
import java.util.Scanner;

public class Wren_Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create scanner for user input
		Scanner input = new Scanner(System.in);
		
		// variables
		double weight = 0;
		int distance = 0;
		double rate = 0;
		double cost = 0;
		boolean validSize = false;
		boolean withinRange = false;
		
		// welcome to package shipper
		System.out.println("Welcome to Package Shipper!");
		System.out.println("Let's discus your package!");
		//while loop will run until acceptable weight is given
		while(validSize == false) {
			
			//gather information
			System.out.println("How much does your package weigh in pounds? We ship up to 20 lbs!");
			weight = input.nextDouble();
			
			if(weight > 0 && weight < 20) {
				validSize = true;
			}
			else {
				System.out.println("Error: Invalid input");
				System.out.println("Please try again.");
			}
		}
		
		//assigning of rate based on weight
		if(weight < 1.1) {
			rate = 3.50;
		}
		else if (weight > 1 && weight < 5.1) {
			rate = 5.50;
		}
		else if (weight > 5 && weight < 10.1) {
			rate = 8.50;
		}
		else if (weight > 10 && weight < 20.1) {
			rate = 10.50;
		}
		
		//prompt for distance within range
		while(withinRange == false) {
			
			System.out.println("How far will your package be traveling? We offer service between 10 and 3000 miles! ");
			distance = input.nextInt();
			input.close();
			
			if(distance > 9 && distance < 3001) {
				withinRange = true;
				
				//compute cost based on distance
				 if (distance < 1000) {
					cost = rate * 1;
					System.out.println("The package will cost $" + cost + "0 to ship" );
				}
				else if (distance < 1500) {
					cost = rate * 2;
					System.out.println("The package will cost $" + cost + "0 to ship" );
				}
				else if (distance < 2000) {
					cost = rate * 3;
					System.out.println("The package will cost $" + cost + "0 to ship" );
				}
				else if (distance < 2500) {
					cost = rate * 4;
					System.out.println("The package will cost $" + cost + "0 to ship" );
				}
				else if (distance < 3001) {
					cost = rate * 5;
					System.out.println("The package will cost $" + cost + "0 to ship" );
				}
		
			}
			else {
				System.out.println("Error: Invalid input");
				System.out.println("The distance is not within range. Try again.");
			}
			
		
		}
		
		

	}

}
