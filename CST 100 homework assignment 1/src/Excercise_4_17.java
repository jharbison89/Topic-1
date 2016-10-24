import java.util.Scanner;

public class Excercise_4_17 {

	public static void main(String[] args) {
		// provides the days in a month given the month and year

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year");
		int year = input.nextInt();
		
		System.out.print("Enter a month:");
		String month = input.next();
		
		int days = 0;
		
		if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Aug")|| month.equals("Oct") || month.equals("Dec")){
			days = 31;
		}
		else if (month.equals("Apr")|| month.equals("Jun")|| month.equals("Sep")|| month.equals("Nov")){
			days = 30;
		}
		else if (month.equals("Feb")){
			if((year % 4 == 0 && year %100 != 0) || (year % 400 == 0)) days = 29;
			else days = 28;
		}

		
		if (days != 0){
			System.out.printf("%s %d has %d days \n", month, year, days);
		}
		else System.out.println("not a valid month");
	}

}
