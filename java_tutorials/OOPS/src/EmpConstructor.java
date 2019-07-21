import java.util.*;
public class EmpConstructor {
        String name;
        String address;
        
        EmpConstructor() {   // no parameter in the constructor
        	
            System.out.println("Constructor without parameter");
        }
        
        EmpConstructor(String n,String address) {
            name = n; //this keyword ref to class member
            this.address = address;
        }
        
        public void displayEmployeeDetails() {
            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
        }
        
        public static void main(String[] args) {
        	EmpConstructor obj1 = new EmpConstructor();
            
            EmpConstructor obj = new EmpConstructor("sasmita","bng"); //new Employee() - default constructor
            obj.displayEmployeeDetails();
            
        }
}