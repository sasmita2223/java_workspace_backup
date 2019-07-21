import java.util.*;
public class StringNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String names[] = new String[5];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i <= names.length;i++)
        {
            names[i] = sc.nextLine();
        }
        System.out.println("-----------------------");
        
        for(int i=0;i<=names.length;i++) {
            System.out.println(names[i]);
        }
    }
}


