import java.util.Scanner;

public class Exercise_2_4 {

	public static void main(String[] args) {
		// This program converts pounds to kilograms
		double kilograms;	// initialize vairables to be used
		double pounds;
		Scanner input = new Scanner(System.in);		// creates a scanner object
		System.out.print("Enter a number in pounds: ");	
		pounds = input.nextDouble();		// reads input from keyboard
		kilograms = pounds * 0.454; 		// calculates kilograms
		System.out.println(pounds + " pounds is " + kilograms + " kilograms");

	}

}
