
public class Exercise_1_13 {

	public static void main(String[] args) {
		// Solves a given 2x2 linear equation
		System.out.println("Given  3.4x + 50.2y = 44.5");
		System.out.println("and    2.1x + .55y = 5.9");
		System.out.println("x is");
		System.out.println((44.5*.55-50.2*5.9)/(3.4*.55-50.2*2.1));
		System.out.println("and y is");
		System.out.println((3.4*5.9-44.5*2.1)/(3.4*.55-50.2*2.1));
	}

}
