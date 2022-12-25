package basic_programs;

import java.util.Scanner;

//Java Program to Check if Given Integer is Odd or Even


//Using Brute Forcew Approach

class OddEven {

	// Main Driver Method
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
	
		// Declaring and initializing integer variable
		
		int a = in.nextInt();

		// Checking if number is even or odd number
		// via remainder
		//if (a % 2 == 0)		// Using Modulo
		// if ((a | 1) > a)		// Using AND Operator
		if ((a & 1) == 1)		// Using OR Operator
		{
			// If remainder is zero then this number is even
			System.out.println("Entered Number is Odd");
		}

		else {

			// If remainder is not zero then this number is
			// odd	
			System.out.println("Entered Number is Even");
		}
	}
}
