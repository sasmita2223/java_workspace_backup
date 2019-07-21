//arraylist is a system defined class name

import java.util.*;

public class ALProgram {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>(); 
		names.add("ram");
		names.add("ravi");
		names.add("mahesh"); //satish
		names.add("suresh");
		
		//foreach loop is for arralylist 
		for(String name: names) {
			System.out.println(name); //o/p:
		}
		System.out.println("--------------");
		
		ArrayList<Integer> i = new ArrayList<Integer>(); 
		i.add(100);
		i.add(200);
		i.add(300);
	
		
		//foreach loop is for arralylist 
        for(int num : i) {       
        	System.out.println(num);   
        	} 
			System.out.println("---------");
			
			Scanner sc = new Scanner(System.in);
			
			ArrayList<Double> sal = new ArrayList<Double>();
			for(int x=0;x<=3;x++) {
				sal.add(sc.nextDouble());
			}
			for(double num : sal) {
				System.out.println(num);
							}
			Collections.sort(names);  //sorting the array list in ascending order
			
			System.out.println("--------------");
			
				System.out.println(names.contains("ravi"));
				System.out.println(names.indexOf("ravi"));
				names.set(2,"satish"); // modifying the value from mahesh to satish
				names.remove("mahesh");
				
				//removes the entire things from the list
				names.clear();
				
				System.out.println("----------------");
				
				for(String name: names) {
					System.out.println(name);
				}
				System.out.println("--------------");
				
				for(String name : names) {
		            System.out.println(name);
		        }
		        
		        
		        System.out.println(names.contains("ravi")); // search for a value(exists or not)
		        System.out.println(names.indexOf("ravi")); // getting the posn for a search val
		        names.set(2, "satish"); //modifying the value
		        names.remove("mahesh");
		        
		        names.add(2, "vinay"); //adding the value in between the list based on the posns
		        names.add(names.size(), "aaaa"); // add this aaaa at the end
		        
		        names.clear(); // remove entire elements to check wheather it is empty or not
		        
		        System.out.println(names.isEmpty());
		        
		        System.out.println("----------------");
		        
		        for(String name : names) {
		            System.out.println(name);
		        }
		        
		        System.out.println("-------------------");
		    }
		}
			
		
		

	}


