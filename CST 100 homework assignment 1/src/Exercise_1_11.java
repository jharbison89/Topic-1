
public class Exercise_1_11 {

	public static void main(String[] args) {
		// estimates the population based off given values and population rates in the textbook
		// there are 31,536,000 seconds in a year with 365 days
		System.out.println("Given a starting population of 312032486");
		System.out.println("Popluation after 1 year");
		System.out.println(312032486+(((311536000/7.0)+(31536000/45.0)-(31536000/13.0))*1));
		System.out.println("Popluation after 2 years");
		System.out.println(312032486+(((311536000/7.0)+(31536000/45.0)-(31536000/13.0))*2));
		System.out.println("Popluation after 3 years");
		System.out.println(312032486+(((311536000/7.0)+(31536000/45.0)-(31536000/13.0))*3));
		System.out.println("Popluation after 4 years");
		System.out.println(312032486+(((311536000/7.0)+(31536000/45.0)-(31536000/13.0))*4));
		System.out.println("Popluation after 5 years");
		System.out.println(312032486+(((311536000/7.0)+(31536000/45.0)-(31536000/13.0))*5));
	}

}
