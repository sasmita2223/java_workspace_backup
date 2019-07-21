import java.util.*;

public class Employee {
	
	int employeeId;
	String name;
	String address;
	
	Scanner sc = new Scanner(System.in);
		
	public void acceptEmployeeDetails() {
			System.out.println("Enter employee id");
			employeeId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter employee name");
			name = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter employee address");
			address = sc.nextLine();
			sc.nextLine();
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Employee Id: " + employeeId);
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		
	}

		public static void main(String[] args) {
		// Employee obj- reference
		// initialize the reference
		// using the opt
		
		Employee obj = new Employee(); // new Employee() -- default constructor
		obj.acceptEmployeeDetails();    // calling the func
		obj.displayEmployeeDetails();

}
}

