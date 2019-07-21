class SuperClass{
	
	public void display() {
		System.out.println("Super class");
			}
}

public class SubClass extends SuperClass{
	//sub classs is over riding the super class
	
	public void display() {
		super.display();
		System.out.println("Sub Class"); // calling the super class method within the sub class
	}

	
	// main method

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubClass obj = new SubClass();
		obj.display();
		
	}

}
