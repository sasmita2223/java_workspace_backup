public class ExceptionProgram {
    public static void main(String[] args) {
        try 
        {
        int i=10;
        int j = 10;
        
        int result = i / j;
        String ar[] = {"ram","mahesh","vinod","vinay","sunil"};
        
        System.out.println("result: " + result); // prints 1
        
        System.out.println("-------------");
        
        for(int num =0;num<=ar.length;num++)
            System.out.println(ar[num]);  // prints all the name
        
        }
        catch(ArithmeticException e) {
            System.out.println(e); 	//
        }
        catch(ArrayIndexOutOfBoundsException e1) {
            System.out.println(e1);	//
        }
        finally{
        	System.out.println("Fineally block");
        }
        
        System.out.println("Continue statement");
    }
}
