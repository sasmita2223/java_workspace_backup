
public class SalaryException extends Exception {
	
	public SalaryException()
	{
		super();
		
	}
	public SalaryException(String msg) {  // constructor with args
        //for passing the value from the sub class to the super class constructor
        super(msg); 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
