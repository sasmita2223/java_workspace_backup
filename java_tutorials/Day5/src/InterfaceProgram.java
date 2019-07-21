interface testX{
	// u can have only abstract methods
	// here by default display() is a abstract method
	// user dont need 2 mention explicitly mentioned as abstract
	
	void display();  
	}

interface testY
{
	void displayY();
}

//multiple inheritance (only for interface)
public class InterfaceProgram implements testX, testY{

	//implementation of a method of a interface
	public void displayY() {
		System.out.println("Interface X");		
	}
	public void display() {
		System.out.println("Interface Y");
			}
	
	//main method
	public static void main(String[] args) {
		InterfaceProgram obj = new InterfaceProgram();
		obj.display();
		obj.displayY();		
		
	}

}
