import java.util.*;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* System.out.println ("First program");
		
		System.out.println ("Name: " + args[0]);
		System.out.println ("Company name: " + args[1]);
		
		
		Scanner sc = new Scanner(System.in);
		String Qual;
		System.out.println("Enter your Qualification");
		Qual = sc.nextLine();
		System.out.println("Qual: " + Qual);
		
		int num;
		System.out.println("Enter your number: ");
		num = sc.nextInt();
		System.out.println("Number is: " + num);
		
		sc.close(); */

		// if -else  
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num > 0)
			System.out.println("positive");
		else if (num == 0)
			System.out.println("zero");
		else 
			System.out.println("negative");
			
		// nested if
		if (num > 100)
		{
			if (num < 150)
				System.out.println("num is less than 150");
		}
		else 
			System.out.println("num is less than 100");
			
		{
				
		}
		
		
		
	}
	
	

}
