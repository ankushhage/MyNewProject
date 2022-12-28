package pattern_programs;

public class Downward_Left_Triangle_Star_Pattern 
{
	public static void StarRightTriangle(int k)
	{
		int a,b;
		for(a = k -1 ; a >= 0; a--)
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