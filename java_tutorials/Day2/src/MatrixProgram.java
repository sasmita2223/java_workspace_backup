import java.util.*;

public class MatrixProgram {
	
   public static void main(String[] args) {
       
       //3 rows and 3 columns
       //static initial value is given
       int matrixA[][] = {
               {1,2,3 }, {4,5,6 }, {7,8,9 }
       };
       
       for(int i=0; i<=2;i++) {
           for(int j=0;j<=2;j++) {
               System.out.print(matrixA[i][j] + " ");
           }
           System.out.println();
       }
       
       System.out.println("------------");
       
       //3 rows and 3 columns
       int matrixB[][] = new int[3][3];
       
       Scanner sc = new Scanner(System.in);
       
       //dynamically you are accepting the value from the user
       for(int i=0; i<=2;i++) {
           for(int j=0;j<=2;j++) {
               matrixB[i][j] = sc.nextInt();
           }
       }
       
       for(int i=0; i<=2;i++) {
           for(int j=0;j<=2;j++) {
               System.out.print(matrixB[i][j] + "\t ");
           }
           System.out.println();
       }
   }
}
