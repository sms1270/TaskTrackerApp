package day7;

import java.util.*;

public class commonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;		
		String[] array1 = {"Joe", "Jack", "June", "Jean", "Beano", "Booya"};
		String[] array2 = {"Brenda", "Brock", "Shelly", "Sheila", "Jack", "Joe"};
		int numlength1 = array1.length;
		int numlength2 = array2.length;
		
		for (a=0; a<numlength1; a += 1 ) {
			for (b=0; b<numlength2; b += 1) {
				System.out.println(array1[a].equals(array2[b]));
			}
		}
	}

}
