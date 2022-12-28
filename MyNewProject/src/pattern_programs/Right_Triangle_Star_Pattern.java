package pattern_programs;


//Java code to demonstrate right star triangle
public class Right_Triangle_Star_Pattern 
{
	// Function to demonstrate printing pattern
	public static void StarRightTriangle(int n)
	{
		int a,b;
		for(a = 0; a < n; a++)
		{
			for(b = 0; b <= a; b++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}

	// Driver Function
	public static void main(String args[])
	{
		int k = 5;
		StarRightTriangle(k);
	}
}
