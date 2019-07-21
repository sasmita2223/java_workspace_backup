

public class SumOfPrimes {

	//Function
	int findSumOfPrimesBetween(int from, int to) {
		// Student code begins here
	
		return 0;
		
		// Student code ends here
	}

	void printSumOfPrimes(int from, int to) {
		System.out.println(findSumOfPrimesBetween(from, to));
	}

	public static void main(String[] args) {

		if(args.length!=2){
			System.out.println("Exactly 2 inputs required.");
			return;
		}

		try {
			int num1, num2;
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			
			SumOfPrimes obj = new SumOfPrimes();
			obj.printSumOfPrimes(num1, num2);
		} catch (NumberFormatException e) {
			System.out.println("Only integers allowed.");
		}
		
	}
}
