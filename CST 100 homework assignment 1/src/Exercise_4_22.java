import java.util.Scanner;

public class Exercise_4_22 {

	public static void main(String[] args) {
		// determines if a string is a substring
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter string s1:");
		String s1 = input.nextLine();
		
		System.out.print("Enter string s2:");
		String s2 = input.nextLine();
		
		if(s1.contains(s2)){
			System.out.printf("\"%s\" is a substring of \"%s\"\n", s2, s1);
		}
		else{
			System.out.printf("\"%s\" is not a substring of \"%s\"\n", s2, s1);
		}

	}

}
