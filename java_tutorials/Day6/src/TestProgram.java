
public class TestProgram {

	public static void main(String[] args) {
		
		int a = 10;
		Integer b = Integer.valueOf(a);  // boxing (from the primitive type stored into an obj)
		System.out.println(b);
		
		// b becomes int class type i.e reference type
		
		
		Double d = new Double(10.23);
		double n = d.doubleValue();  // unboxing
		System.out.println(n);
		
		String num = "12345";  // string to int
		int num1 = Integer.parseInt(num);
		System.out.println(num1);
		
			
		String num2 = "12345.45"; // string to double
		double num3 = Double.parseDouble(num2);
		System.out.println(num3);
		
				
		/* int e = Integer.parseInt("x"); // o/p: NumberFormatException
		System.out.println(e); */
		
		//unbox
		int e1 = Integer.parseInt("123"); //un-boxing //converting ref-type to value type
		System.out.println(e1);  // similar type of data
		
		
		float f = Float.parseFloat("123.5f"); //un-boxing //converting ref-type to value type	
		System.out.println(f); // similar type of data
		
		//type casting
		double p = 2345.43;
		int res = (int)p;
		System.out.println(res); // o/p:2345
		
		
		

	}
	
	
	

}
