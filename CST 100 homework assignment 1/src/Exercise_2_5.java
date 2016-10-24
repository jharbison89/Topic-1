import java.util.Scanner;

public class Exercise_2_5 {

	public static void main(String[] args) {
		// This program calculates gratuity and totals given an input of subtotal and gratuity rate
		Scanner input = new Scanner(System.in);	// creates a scanner
		System.out.print("Please enter subtotal: ");
		float subtotal = input.nextFloat();	// obtains subtotal
		System.out.print("Please enter gratuity rate(e.g., 15 for 15%): ");
		float rate = input.nextFloat();// gets desired gratuity rate
		rate = rate / 100;		// converts input rate into percentage for calculations
		float gratuity = subtotal * rate;
		float total = subtotal + gratuity ;
		gratuity = (int)(gratuity * 100)/100.0F;
		total = (int)(total *100)/100.0F;
		System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
	}

}
