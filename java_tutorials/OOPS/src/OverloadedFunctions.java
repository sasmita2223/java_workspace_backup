
public class OverloadedFunctions {
	
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public static float sum(float a, float b) {
		return a+b;
	}
	
	 // above example of same func name 'sum' with diff data types & diff parameter
	
	// main method
	
	public static void main(String[] args) {
		System.out.println(OverloadedFunctions.sum(10, 20));
		System.out.println(OverloadedFunctions.sum(10,20,30));
		System.out.println(OverloadedFunctions.sum(10.4f, 20.5f));
		
		
	}

}
