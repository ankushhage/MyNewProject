package pattern_programs;

//Java program to find the perimeter of a Rectangle

class Perimeter_Rectangle 
{
	public static  void Perimeter(int L, int B)
	{
		int P = 2 * (L + B);
		System.out.println("The Perimeter of an Rectangle is : " + P);
	}
	
	public static void main(String[] args)
	{
		int L = 10;
		int B = 20;
		Perimeter(L,B);
		
	}
}
