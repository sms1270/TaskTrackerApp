
package Arrays;

import java.util.*;

public class array_lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] listOfNames = {"Tracy","Doe","Bob","Joe","Sam"};
		int x = listOfNames.length;
		int y;
		
		for (y = 0; y < 5; y += 1) {
			if (listOfNames[y] != "Joe") {
				System.out.print("The name is " + listOfNames[y] + " ");
				evenOdd(y);
			}
			else {
				break;
			}
		}
		System.out.println();
		System.out.println();
		
		pickAlocation();
		
		
	}
			
		final static int evenOdd(int even_or_odd) { 
			if (even_or_odd % 2 == 0) {
				int even_num = even_or_odd;
				System.out.println(even_num);
			}
			else {
				int odd_num = even_or_odd;
				System.out.println(even_or_odd);
			}
			return 0;
		}
		
		public static int pickAlocation() {
			int[] numbers = {5,6,9,1,6};
			int l = numbers.length;
			int[] num2 = {6,1,4,3,2,0,5,1};
			int m = num2.length;
			int x;
			int y;
			for (x = 0; x < l; x += 1) {
				System.out.println("The number is " + numbers[x] + " and the location is " + x);
				for (y = 0; y < m; y += 1) {
					if (numbers[x] == num2[y]) {
						System.out.println("The common number is " + numbers[x]);
						
					}
				}
				
			}
			System.out.println();
			System.out.println();
			return 0;
		}
		

}
	