class SalaryException extends Exception {
    public SalaryException( ) { //constructor without args
        super();
    }
    
    public SalaryException(String msg) {  // constructor with args
        //for passing the value from the sub class to the super class constructor
        super(msg); 
    }
    
}
public class UserDefinedTest {
	
    public static void main(String[] args) {
        
        try {
        int sal = -35000; // o/p: SalaryException: negative salary can't be lesser than 0
       // int sal = 35000;	// o/p: 35000
        
        if(sal < 0) 
            throw new SalaryException("negative salary can't be lesser than 0");
        else
            System.out.println(sal);
        }
        catch(SalaryException e) {
            System.out.println(e);
        }
    }
}
        
    

