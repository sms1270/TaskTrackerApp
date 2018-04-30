package positiveornegative;

import java.util.*;

public class positiveOrNegative {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int x, y,z;
			System.out.println("Enter three integers to calculate their sum ");
			Scanner in = new Scanner(System.in);
			x = in.nextInt();
			y = in.nextInt();
			z = in.nextInt();
			
			int listOfNumbers[] = {x, y, z};
			
			PickADirection(listOfNumbers);
			greatestNumber(x,y,z);
			calculator.Calculator.calculateDifference(x,y,z);
			calculator.Calculator.calculateDivision(x,y,z);
			calculator.Calculator.calculateProduct(x,y,z);
	}


	
	public static void PickADirection(int numberList1[]) {
		
		int a = 0;
		for (a=0; a<3; a+=1 ) {
			if (numberList1[a] < 0) {
				System.out.println("The number " + numberList1[a] + " is a negative number.");
			}
			else {
				System.out.println("The number " + numberList1[a] + " is a positive number.");
			}
		}
		return;
	}
		
	public static void greatestNumber(int input1, int input2, int input3) {
		int a = 0;
		int greatest_number = 0;
		for (a=0; a<3; a += 1 ) {
			if ( (input1 > input2) && (input1 > input3) ) {
				greatest_number = input1;
			}  
			else if ( (input2 > input1) && (input2 > input3) ) {
				greatest_number = input2;
			}
			else if ( (input3 > input1 ) && (input3 > input2) ) {
				greatest_number = input3;
			}
		}
			System.out.println("The greatest number is " + greatest_number);
			return;
			
	}
}
	
	
	


