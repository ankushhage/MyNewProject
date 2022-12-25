package basic_programs;

//Java Program to Find the Largest of three Numbers
//Using Collections.max() method

import java.lang.*;
import java.util.*;

class LargestNumberFromThree1 {

	public static void main(String[] args)
	{
		int a, b, c;
		// Considering random integers three numbers
		a = 5;
		b = 2;
		c = 3;
		
		ArrayList<Integer> x = new ArrayList<>();
		x.add(a);
		System.out.println(a);
		x.add(b);
		System.out.println(b);
		x.add(c);
		System.out.println(c);

		// Printing the largest number
		System.out.println(Collections.max(x)
						+ " is the largest number.");
	}
}
