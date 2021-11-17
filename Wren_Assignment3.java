import java.util.Scanner;
public class Wren_Assignment3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		boolean exit = false;
		
		//creating objects
		SavingsAccount account = new SavingsAccount();
		Scanner input = new Scanner(System.in);
		
		
		//getting initial information from user
		System.out.println("Please Enter an account number");
		account.id = input.nextInt();
		
		System.out.println("Please Enter the initial balance");
		account.balance = input.nextDouble();
		
		System.out.println("Please Enter the annual intrest rate");
		account.annualIntRate = input.nextDouble();
		
		//create loop to allow multiple actions on the account
		while(exit == false) {
			
			int menu;
			//display menu
			System.out.println("What woud you like to do?");
			System.out.println("  1: Make a deposit");
			System.out.println("  2: Check weekly intrest");
			System.out.println("  3: View account details");
			System.out.println("  4: Exit");
			
			menu = input.nextInt(); //accept menu option
			
			switch(menu) {
			
			case 1:
				System.out.println("How much would you like to deposit?");
				account.deposit(input.nextDouble());
				System.out.println("The new balance is " + account.balance);
				
				break;
			case 2:
				System.out.println("The current weekly intrest is " + account.weeklyInt());
				
				break;
			case 3:
				System.out.println("account number");
				System.out.println(account.getId());
				System.out.println("Balance is " + account.getBalance());
				System.out.println("This account was opened on");
				System.out.println(account.getEstablished());
				break;

			case 4:
				System.out.println("ACCOUNT ACCESS TERMINATED");
				exit = true;
				break;
				
			default:
				System.out.println("   **Invalid Selection**");
				System.out.println("Please select number 1, 2, 3, or 4");
				break;
				

			
			}
			
			
		}

	}

}


