package secJavClas;

import java.util.Scanner;

class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int w, x, y, z;
		System.out.println("Enter three integers to calculate their sum ");
		Scanner in = new Scanner(System.in);
		w = in.nextInt();
		x = in.nextInt();
		y = in.nextInt();
		z = x + y;
		System.out.println("Sum of entered integers = " + z);
	}
}