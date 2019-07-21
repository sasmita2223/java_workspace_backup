public class DaysInMonthAndYear {
	//Function
	public int getMaxDays(int month, int year) {
		// Student code begins here
		int numberOfDays = 0;
		if(month <=0 || month > 12){
			return -1;
		}
		if(year <= 0){
			return -2;
		}
		boolean isLeapYear = isleap(year);
		switch(month){
				case 1:
				case 3:
				case 5:
				case 7:
				case 9:
				case 11:
					numberOfDays = 31;
					break;
				case 4:
				case 6:
				case 8:
				case 10:
				case 12:
					numberOfDays = 30;
					break;
				case 2:
					if(isLeapYear){
						numberOfDays = 29;
					}else{
						numberOfDays = 28;
					}
		}
			return numberOfDays;
		// Student code ends here
	}
	
	

	public void printMaxDays(int month, int year) {
		System.out.print(getMaxDays(month, year));
	}

	 public static boolean isleap(int year){
	 	if(year % 4 == 0){
	 		if(year % 100 == 0){
	 			if(year % 400 == 0){
	 				return true;
	 			}else{
	 				return false;
	 			}
	 		}else {
	 			return false;
	 		}
	 	}else {
	 		return false;
	 	}
	    }


	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("Exactly 2 inputs required");
			return;
		}

		try {
			int num1, num2;
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			DaysInMonthAndYear obj = new DaysInMonthAndYear();
			obj.printMaxDays(num1, num2);
		} catch (NumberFormatException e) {
			System.out.println("Only integers allowed.");
		}
		

	}
}
