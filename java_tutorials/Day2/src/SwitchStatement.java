import java.util.*;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		int num;
		Scanner sc = new Scanner(System.in);
	    num = sc.nextInt();
		
		switch (num)
		{	
			case 1: System.out.println("Monday");
					break;
			case 2: System.out.println("Tuesday");
					break;
			case 0: System.out.println("Sunday");
					break;
			case 3: System.out.println("wednesday");
					break;
			case 4: System.out.println("Thursday");
					break;
			case 5: System.out.println("Friday");
					break;
			case 6: System.out.println("Saturday");
					break;
			default: System.out.println("Invalid option");
			
			break;
		}
		
		
	}
	// print number from 1 to 10
	int num1 = 1;
	
		while(num1 <=10)
		{
			System.out.println(num1);
			num1++;
		}
	

}
}
