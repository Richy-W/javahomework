import java.util.Scanner; // import scanner to allow input
public class ComputeArea {

	public static void main(String[] args) {
		
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		// prompt response from user
		System.out.print("What is the radius of your circle?");
					
		//set veriables
		double radius = input.nextDouble();
		double area;
		final double PI = 3.14159; //final is a constant and cant be changed
		
		//calculate area of a circle
		area = radius * radius * PI;
		
		//display information
		System.out.println("The area of a circle with a radius of " + radius + " is " + area);

	}

}
