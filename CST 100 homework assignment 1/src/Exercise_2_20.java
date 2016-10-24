import java.util.Scanner;

public class Exercise_2_20 {

	public static void main(String[] args) {
		// Calculates next month's interest given an input balance and interest rate
		Scanner input = new Scanner(System.in);
		System.out.print("Enter current balance:");
		float balance = input.nextFloat();
		System.out.print("Enter interest rate (e.g., 3 for 3%):");
		float rate = input.nextFloat();
		float interest = balance *(rate/1200);
		System.out.println("The interest is " + interest);
	}

}
