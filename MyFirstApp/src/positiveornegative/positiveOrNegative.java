package positiveornegative;

import java.util.Scanner;

public class positiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y, z;
		System.out.println("Enter three integers to calculate their sum ");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		
		pickADirection(x,y,z);
		greatestNumber(x,y,z);
		calculator.Calculator.calculateDifference(x, y, z);
		calculator.Calculator.calculateDivision(x,y,z);
		calculator.Calculator.calculateProduct(x,y,z);
	}
	
	public static void pickADirection(int input1, int input2, int input3) {
		int a;
		for (a = 0; a < 3; a += 1) {
			if (input1 < 0) {
				System.out.println("The first number " + input1 + " is a negative number");
			}
			else {
				System.out.println("The first number " + input1 + " is a positive number");
			}
			
			if (input2 < 0) {
				System.out.println("The second number " + input2 + " is a negative number");
			}
			else {
				System.out.println("The second number " + input2 + " is a positive number");
			}
			
			if (input3 < 0 ) {
				System.out.println("The third number " + input3 + " is a negative number");
			}
			else {
				System.out.println("The third number " + input3 + " is a positive number");
				System.out.println();
			}
			return;
		}
		}
		
		public static void greatestNumber(int number1, int number2, int number3) {
			int a;
			int biggest_number = 0;
			for (a = 0; a < 3; a+= 1) {
				if ((number1 > number2) && (number1 > number3)) {
					biggest_number = number1;
				}
				else if ((number2 > number1) && (number2 > number3)) {
					biggest_number = number2;
				}
				else if ((number3 > number1) && (number3 > number2))
					biggest_number = number3;
			}
			System.out.println("The greatest number out the three integers is " + biggest_number);
			return;

		}
}

