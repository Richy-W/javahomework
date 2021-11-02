/**
 * @author Richy
 *   This program will check in and out books based on ISBN 
 */

import java.util.Scanner;
public class Wren_Assignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// set global variables
		int count = 0;
		int incoming = 0;
		int outgoing = 0;
		boolean quit = false; 
		Scanner input = new Scanner(System.in); //create a scanner for input
		Scanner num = new Scanner(System.in);
		
		//display a welcome message
		System.out.println("Welcome to ISBN Check Systems");
		System.out.println("   ");
		System.out.println("   ");
		System.out.println("   ");
		
		//main loop
		while(quit == false) {
			
			int menu;
			
			// give menu options 
			
			System.out.println("What woud you like to do?");
			System.out.println("  1: check out a book by ISBN-13");
			System.out.println("  2: check in a book by ISBN-13");
			System.out.println("  3: End of day report totals");
			
			menu = num.nextInt(); //accept menu option
			
			switch(menu) {
			
			case 1:
				
				boolean checkIn = true;
				char end;
				
				while(checkIn == true) {
					
					// variable to check number validity.. passed from 
					boolean validNum;
					
					System.out.println("ISBN Check In");
					System.out.println("Please enter the ISBN-13 of the Book you are checking in. ");
					
					String isbnNum = input.nextLine(); // obtain ISBN from user store in isbn variable
					
					isbnNum = isbnNum.replaceAll("( |-)", "");//replace space and dashes with empty chars
					
					//check if isbn is 13 characters long
					if(isbnNum.length() == 13) {
						validNum = CheckIsbn13(isbnNum); // pass number to ISBN validator
						
						//output based on ISBN is long enough
						if(validNum == false) {
							System.out.println("ISBN-13 is invalid");
							System.out.println(" ");
							System.out.println("Please try again.");
							
						}
						else {
							System.out.println("ISBN-13 accepted"); // output to tell the user the ISBN is counted
							count++;
							incoming++;
							System.out.println("Do you want to check in more? Yes /No");
							end = num.next().charAt(0);
							if (end == 'Y' | end == 'y') {
								checkIn = true;
							}
							else if (end == 'N' | end == 'n') {
								checkIn = false;
							}
							else {
							System.out.println("Please try again.");
							}
							
						}
					}
					else { //ISBN not a valid size
						System.out.println("ISBN-13 is invalid");
						System.out.println(" ");
						System.out.println("Please try again.");
						
					}
				}
				break;
				
			case 2: 
				
				boolean checkOut = true;
				
				while(checkOut == true) {
					
					// variable to check number validity.. passed from 
					boolean validNum;
					
					System.out.println("ISBN Check out");
					System.out.println("Please enter the ISBN-13 of the Book you are checking out. ");
					
					String isbnNum = input.nextLine(); // obtain ISBN from user store in isbn variable
					
					isbnNum = isbnNum.replaceAll("( |-)", "");//replace space and dashes with empty chars
					
					//check if isbn is 13 characters long
					if(isbnNum.length() == 13) {
						validNum = CheckIsbn13(isbnNum); // pass number to ISBN validator
						
						//output based on ISBN is long enough
						if(validNum == false) {
							System.out.println("ISBN-13 is invalid");
							System.out.println(" ");
							System.out.println("Please try again.");
							
						}
						else {
							System.out.println("ISBN-13 accepted"); // output to tell the user the ISBN is counted
							count--;
							outgoing++;
							System.out.println("Do you want to check in more? Yes /No");
							end = num.next().charAt(0);
							if (end == 'Y' | end == 'y') {
								checkIn = true;
							}
							else if (end == 'N' | end == 'n') {
								checkIn = false;
							}
							else {
							System.out.println("Please try again.");
							}
						}
					}
					else { //ISBN not a valid size
						System.out.println("ISBN-13 is invalid");
						System.out.println(" ");
						System.out.println("Please try again.");
						
					}

				}
				break;
				
			case 3:
				//display end of day values and quit main loop
				System.out.println("End of day total is " + count + " transactions");
				System.out.println("there where " + incoming + " books checked in");
				System.out.println("there where " + outgoing + " books checked out");
				System.out.println("Good Bye!");
				quit = true;
				break;
				
			default:
				//invalid selection message
				System.out.println("**INVALID SELECTION**");
				System.out.println("Please try again.");
				break;
			}
		}

	}
	// checks formula for ISBN 13
	private static boolean CheckIsbn13(String isbnNum) {
		
		int sum = 0;
		int value;
		
		for (int d = 0; d < 13; d++) {
			value = Integer.parseInt(isbnNum.substring(d, d + 1));
			if (d % 2 == 0) {
				sum += value * 1;
			}
			else {
				sum += value * 3;
			}
		}
		return (sum % 10 == 0);
		}
			

}
