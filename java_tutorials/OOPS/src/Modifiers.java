import firstpack.*;

public class Modifiers {

	private int i = 0; 
	
	// can be accessed within the package & in any class of the default package of project (oops)
	
	
	public static void main(String[] args) {
		
		Modifiers obj = new Modifiers();
		System.out.println(obj.i);
		
		FirstTest obj1 = new FirstTest();
		System.out.println(obj1.x);
		

	}

}
