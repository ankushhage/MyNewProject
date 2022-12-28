package pattern_programs;

//Java code to demonstrate right star triangle
public class Left_Triangle_Star_Pattern 
{
	// Function to demonstrate printing pattern
	public static void StarRightTriangle(int k)
	{
		int a,b;
		for(a = 0; a < k; a++)
		{
			for(b = 2 * (k-a); b >= 0; b--)
			{
				System.out.print(" ");
			}
			
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
