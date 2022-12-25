package basic_programs;

//Java program to demonstrate working of Scanner in Java
import java.util.Scanner;

class GetInputFromUser {
	public static void main(String args[])
	{
		
		try (Scanner in = new Scanner(System.in)) 						// Using Scanner for Getting Input from User
		{
			String s = in.nextLine();
			System.out.println("You entered String:" + s);
		
			int a = in.nextInt();
			System.out.println("You entered integer " + a);

			float b = in.nextFloat();
			System.out.println("You entered float " + b);
		}
		
		catch (Exception e) 
		{
			System.out.println("Entered Wrong value");
			// TODO: handle exception
		}
	}
}
