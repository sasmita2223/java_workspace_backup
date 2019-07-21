public class ReverseOfNumber {
	
	//Function
	public long reverse(long input) {
		// STUDENT CODE BEGINS HERE
		
	return 0;
		
		// STUDENT CODE ENDS HERE
	}

	private void printInReverse(long input) {
		System.out.println(reverse(input));
	}

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Exactly 1 input required.");
			return;
		}
		
		if(args[0].toUpperCase().endsWith("L")){
			args[0] = args[0].substring(0, args[0].length()-1);
			
		}

		try {
			long input = Long.parseLong(args[0]);
			ReverseOfNumber obj = new ReverseOfNumber();
			obj.printInReverse(input);
		} catch (NumberFormatException e) {
			System.out.println("Only integers allowed.");
		}
	}
}
