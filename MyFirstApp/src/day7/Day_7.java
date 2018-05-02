package day7;

import java.util.Scanner;

public class Day_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month = 0;
		System.out.println("Enter a number between 1 and 12:  ");
		Scanner in = new Scanner(System.in);
		month = in.nextInt();
			
		monthOfYear(month);
		
		icyHot(120,-1);
		icyHot(-1,120);
		icyHot(2,120);
		
		posNeg(1,-1,false);
		posNeg(-1,1,false);
		posNeg(-4,-5,true);
	}
	
	
	final static void icyHot(int x,int y) {
		boolean yesOrNo;
		if ( ( (x < 0) && (y > 100) ) || ( (y < 0) && ( x > 100) ) ) {
			yesOrNo = true;
			System.out.println(yesOrNo);
		} else {
			yesOrNo = false;
			System.out.println(yesOrNo);
		}
	}
	
	
	final static void posNeg(int x,int y,boolean z) {
		boolean yesOrNo;
		if (z == true) {
			if ( (x < 0 ) && (y < 0 ) ) {
				yesOrNo = false;
				System.out.println(yesOrNo);
			} 
		}
		if ( z == false) {
			if ( ( (x < 0) && (y > 0) ) || ( (y < 0 ) && (x > 0) ) ) {
				yesOrNo = true;
				System.out.println(yesOrNo);
			}
		}
	}
	
	
	final static void monthOfYear(int mon) {
		switch (mon) {
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;
			default:
				System.out.println("You did not enter a number between 1 and 12.  Please try again.");
				break;
		}
	}
}
