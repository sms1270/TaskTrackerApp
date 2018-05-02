package day6;

import java.util.*;

public class Day_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1, b=2, c=3;
		int listOfNumbers[] = {a,b,c};
		int average = 0;
		int sum1 = 0;
		int counter;
		
		// Find the average
		for (counter=0; counter<2; counter += 1) {
			sum1 += listOfNumbers[counter];
			System.out.println(listOfNumbers[counter]);
			average = average + listOfNumbers[counter];
		}
			average = average/2;
			System.out.println("The sum of the first two integers is " + sum1);
			System.out.println("The average of the first two integers is " + average);
		
		sumDouble(1,2);
		sumDouble(3,2);
		sumDouble(2,2);
		
		makes10(9,10);
		makes10(9,9);
		makes10(1,9);
		
		parrotTrouble(true,6); 
		parrotTrouble(true,7);
		parrotTrouble(false,6);
		
	}
	
	final static int sumDouble(int x,int y) {
		int sum = 0;
			if (x != y) {
				sum = (x + y) * 2;
				System.out.println("The total is " + sum);
			} else {
				sum = x + y;
				System.out.println("The total is " + sum);
			}
		return sum;
		}
		
	
		
	
	final static boolean makes10(int x, int y) {
		if ( (x == 10) || (y == 10) ) {
			return true;
		} else if ( x + y == 10  ) {
			return true;
		} else {
			return false;
		}
	}
	
	
	final static void parrotTrouble(boolean input1, int input2) {
		if (input1 == true) {		
		 	if ( (input2 < 7) || (input2 >= 20) ) { System.out.println("True"); }	 
			else if ( (input2 >= 7) || (input2 < 20) ) { System.out.println("False"); }  
		} else if (input1 == false) { System.out.println("False"); }
	}
}
				


