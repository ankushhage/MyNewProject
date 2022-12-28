package pattern_programs;
//Java code to demonstrate right star triangle
public class Downward_Right_Triangle_Star_Pattern 
{
	// Function to demonstrate printing pattern
	public static void StarRightTriangle(int k)
	{
		int a,b;
		for(a = k - 1; a >= 0; a--)
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
		int k = 7;
		StarRightTriangle(k);
	}
}
