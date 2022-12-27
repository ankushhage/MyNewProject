package basic_programs;

//Java program to find compound interest for
//given values.
import java.io.*;

class CompoundInterest
{
	public static void main(String args[])
	{
		double principal = 1200, rate = 5.4, time = 2;

		/* Calculate compound interest */
		double CI = principal * (Math.pow((1 + rate / 100), time));
		
		System.out.println("Compound Interest is "+ CI);
	}
}
//This code is contributed by Anant Agarwal.
