package basic_programs;

//Java program to compute
//simple interest for given principal
//amount, time and rate of interest.
import java.io.*;

class SimpleInterest 
{
	public static void main(String args[])
	{
		// We can change values here for
		// different inputs
		float P = 10000, R = 2, T = 1;

		/* Calculate simple interest */
		float SI = (P * T * R) / 100;
		System.out.println("Simple interest = " + SI);
	}
}