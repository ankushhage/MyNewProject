package basic_programs;

//Java program to demonstrate BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Test {
	public static void main(String[] args)
		throws IOException
	{
		// Enter data using BufferReader
		BufferedReader reader = new BufferedReader(
			new InputStreamReader(System.in));
		System.out.println("Enter Data");

		// Reading data using readLine
		String name = reader.readLine();

		System.out.println("Your Data is:");
		
		// Printing the read line
		System.out.println(name);
	}
}
