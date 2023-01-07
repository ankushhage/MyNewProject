package conversion_programs;
class Binary_to_Octal 
{
	int binaryToDecimal(long binary)
	{
		int decimalNumber = 0, i = 0;
		while (binary > 0) 
		{
			decimalNumber += Math.pow(2, i++) * (binary % 10);
			binary /= 10;
		}
		return decimalNumber;
	}
	int decimalToOctal(long binary)
	{
		int decimalNumber = binaryToDecimal(binary);
		String octalString	= Integer.toOctalString(decimalNumber);
		int octalNumber = Integer.parseInt(octalString);
		return octalNumber;
	}

	// Driver Code
	public static void main(String[] args)
	{
		Binary_to_Octal ob = new Binary_to_Octal();
		System.out.println("octal number:"+ob.decimalToOctal(100101));
	}
}
