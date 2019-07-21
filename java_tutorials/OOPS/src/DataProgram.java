import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class DataProgram {
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date dt = new Date();
		
		System.out.println(dt);
		
		SimpleDateFormat s = new SimpleDateFormat("dd-MMM-yyyy E");
		
		
		// E - stands for the week name
		// MM - 06		
		System.out.println(s.format(dt)); */
	
	public static void main(String[] args) throws ParseException {
		
		Date dt = new Date();		
		System.out.println(dt);
		
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(s.format(dt));
		
		// E - stands for the week name
		// MM - 06 (exm)
		String str = "12-12-2019";
		System.out.println(str);
		System.out.println(s.parse(str));
		

	}

}
