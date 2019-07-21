
public class StringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = "janakiram";
		System.out.println(name.toUpperCase());  // JANAKIRAM
		
		name = "RAVI";
		System.out.println(name.toLowerCase()); // ravi
		
		name = "Hello world";		
		System.out.println(name.substring(2,3)); // l 
		System.out.println(name.charAt(6)); // w
		System.out.println(name.contains("H"));  // true search for a char is present or not
		System.out.println(name.indexOf("d"));  // 10
		
		name = "Hello";		
		System.out.println(name.substring(2,4)); // print ll --starting index 0 to 2 from integer point 4
		
		System.out.println(name.startsWith("H")); //check wheather H is there in the given string or not
		System.out.println(name.endsWith("w")); // check wheather w is there in the given string or not
		
		System.out.println("---------------");
		
		String dt = "10-Jul-2019";
		String m[] = dt.split("-");
		 
		for (int i=0;i<=m.length-1;i++) {
			System.out.println(m[i]);
		}
}
}