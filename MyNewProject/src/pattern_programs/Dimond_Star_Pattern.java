package pattern_programs;
public class Dimond_Star_Pattern 
{
	public static void main(String[] args)
	{
		int number = 7,m = 1, n;
		do {
			n = 1;
			do	{	System.out.print(" ");}
			while (++n <= number - m + 1);
			n = 1;
			do	{	System.out.print("*");}
			while (++n <= m * 2 - 1);
			System.out.println();
			}
		while (++m <= number);
		m = number - 1;
		do {
			n = 1;
			do {	System.out.print(" ");}
			while (++n <= number - m + 1);
			n = 1;
			do {	System.out.print("*");}
			while (++n <= m * 2 - 1);
			System.out.println();
		}
		while (--m > 0);
	}
}
