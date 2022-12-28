package pattern_programs;

//class Mirror_Pyramid_Star_Patterns 
//{
//	// Method 1
//	// To print upper part of the pattern
//	private static void displayUpperPart(int size)
//	{
//		// Declaring variables for rows and columns
//		// respectively
//		int m, n;
//
//		// Outer loop for rows
//		for (m = size - 1; m >= 0; m--) {
//
//			// Inner loop 1
//			// to print triangle 1
//			for (n = 0; n < m; n++) {
//
//				// Printing whitespace
//				System.out.print(" ");
//			}
//
//			// Inner loop 2
//			// to print triangle 2
//			for (n = m; n <= size - 1; n++) {
//
//				// Printing star with whitespace
//				System.out.print("*"
//								+ " ");
//			}
//
//			// By now done with one rpw so next line
//			System.out.println();
//		}
//	}
//
//	// Method 2
//	// Main driver method
//	public static void main(String[] args)
//	{
//		// Declaring and initializing variables to
//		// size of the triangle
//		int size = 7;
//
//		// Calling the above Method 1 to
//		// print and display the upper part of triangle
//		displayUpperPart(size);
//	}
//}

//Java Program to Print Lower Part of Mirror Upper Star
//Triangle Pattern


////Main Class
//class Mirror_Pyramid_Star_Patterns {
//
//	// Method 1
//	// To print lower part of the pattern
//	private static void displayLowerPart(int size)
//	{
//
//		// Declaring variables for rows and columns
//		// respectively
//		int m, n;
//
//		// Outer loop fo Rows
//		for (m = 1; m <= size; m++) {
//
//			// Inner loop 1 to print triangle 3
//			for (n = 1; n < m; n++) {
//
//				// Printing whitespace
//				System.out.print(" ");
//			}
//
//			// Inner loop 2 to print triangle 4
//			for (n = m; n <= size; n++) {
//
//				// Printing star and whitespace
//				System.out.print("*"
//								+ " ");
//			}
//
//			// By now done with one row so new line
//			System.out.println();
//		}
//	}
//
//	// Method 2
//	// Main driver method
//	public static void main(String[] args)
//	{
//		// Declaring and initializing variable to
//		// size of the triangle
//		// This is number of rows
//		int size = 7;
//
//		// Calling the above Method1
//		// to display lower part of the triangle
//		displayLowerPart(size);
//	}
//}




class Mirror_Pyramid_Star_Patterns 
{
	// Method 1
	// To print upper part of the pattern
	private static void displayUpperPart(int size)
	{
		// Declaring variables for rows and columns
		// respectively
		int m, n;

		// Outer loop for rows
		for (m = size - 1; m >= 0; m--) {

			// Inner loop 1
			// to print triangle 1
			for (n = 0; n < m; n++) {

				// Printing whitespace
				System.out.print(" ");
			}

			// Inner loop 2
			// to print triangle 2
			for (n = m; n <= size - 1; n++) {

				// Printing star with whitespace
				System.out.print("*"
								+ " ");
			}

			// By now done with one rpw so next line
			System.out.println();
		}
			
		{	
			int i,j;
			// Outer loop fo Rows
			for (i = 1; i <= size; i++) {

				// Inner loop 1 to print triangle 3
				for (j = 1; j < i; j++) 
				{
					// Printing whitespace
					System.out.print(" ");
				}

				// Inner loop 2 to print triangle 4
				for (j = i; j <= size; j++) 
				{
					// Printing star and whitespace
					System.out.print("*" + " ");
				}

				// By now done with one row so new line
				System.out.println();	
			}
		}
	}

	// Method 2
	// Main driver method
	public static void main(String[] args)
	{
		// Declaring and initializing variables to
		// size of the triangle
		int size = 7;

		// Calling the above Method 1 to
		// print and display the upper part of triangle
		displayUpperPart(size);
	}
}