
public class Variable_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char $a = 'a';
        byte a_b = 127;
        long num = 10000000000l;
        float a1 = 10.2345632f;
        
        final int num1 = 20;
        
        System.out.println($a);
        System.out.println(a_b);
        System.out.println(num);
        System.out.println(a1);
        
        System.out.printf("%.2f , %c \n",a1,$a);
        
        
        System.out.println( (10<20) ? 100 : 200 );
        
        System.out.println( (10 < 20) || (20 < 10) );
        
        int a = 10;
        int b = ++a; //prefix
        System.out.println(a + "," + b);
        b = a++; //postfix
        System.out.println(a + "," + b);


	}

}
