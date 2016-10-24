
public class Exercise_20_4 {

	public static void main(String[] args) {
		// creates a list and displays, in decreasing order, the first 50 prime numbers
		
		int number = 1;
		GenericStack<Integer> primes = new GenericStack<>();
		int count = 1;
		int counter = 0;
		int i;
		
		while(count < 50){
			counter = 0;
			for(i = number; i>= 1; i--){	
				
				if (number %i == 0){
					counter++;
				}
			}
			if(counter == 2){
				
				primes.push(number);
				count ++;
			}
			number++;	
		}
		System.out.println("The first 50 prime number are :");
		while(!primes.isEmpty()){
			int display = primes.pop();
			System.out.printf("%d ", display);
		}

	}

}
