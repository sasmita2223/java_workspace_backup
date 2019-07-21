class X {
	
	final int x = 10;
	final void Display() {
		System.out.println("Super class");
	}
}



public class FinalProgram extends X {

	void Display1() {
		
		Display(); // super class
		
		System.out.println("Sub class");
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalProgram obj = new FinalProgram();
		obj.Display(); 	// super class 
		obj.Display1();  // sub class
		
	}

}
