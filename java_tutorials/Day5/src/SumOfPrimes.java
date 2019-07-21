/*A prime number (or a prime) is a natural number greater than 1 that has no positive divisors other than 1 and itself.
Write a function that accepts two integers as parametrers and return the sum of all the prime numbers between the input numbers. If the first parameter is greater than the second one, then swap the inputs and perform the operations.
## Example
 Input:
  10 50
 Output:
  311
 Input:
  50 -100
 Output:
  328 */

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
