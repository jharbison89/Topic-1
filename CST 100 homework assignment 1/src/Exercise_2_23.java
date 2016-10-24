import java.util.Scanner;

public class Exercise_2_23 {

	public static void main(String[] args) {
		// calculates the cost of travel using distance to drive, miles per gallon, and price per gallon
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the driving distance:");
		float distance = input.nextFloat();
		System.out.print("Enter miles per gallon:");
		float mpg = input.nextFloat();
		System.out.print("Enter price per gallon:");
		float price = input.nextFloat();
		
		float cost = (distance * price) / mpg;
		cost = (int)(cost * 100)/ 100.0F;
		
		System.out.println("The cost of driving is $" + cost);
	}

}
