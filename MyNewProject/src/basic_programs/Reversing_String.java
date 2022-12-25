package basic_programs;

//public class Reversing_String {}
class Reversing_String
{
    // Utility function to swap the elements at positions `i` and `j` in the array
    private static void swap(char[] chars, int i, int j)
    {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
 
    // Utility function to reverse subarray `chars[begin…end]`
    public static void reverseText(char[] chars, int begin, int end)
    {
        while (begin < end) {
            swap(chars, begin++, end--);
        }
    }
 
    // Function to reverse a text without reversing the individual words.
    public static String reverseText(String str)
    {
        // base case
        if (str == null || str.length() == 0) {
            return str;
        }
 
        // Since a string is immutable in Java, convert it to a char array
        char[] chars = str.toCharArray();
 
        // `chars[low…high]` forms a word
        int low = 0, high = 0;
 
        // scan the text
        for (int i = 0; i < chars.length; i++)
        {
            // if space is found, we found a word
            if (chars[i] == ' ')
            {
                // reverse the found word
                reverseText(chars, low, high);
 
                // reset `low` and `high` for the next word
                low = high = i + 1;
            }
            else {
                high = i;
            }
        }
 
        // reverse the last word
        reverseText(chars, low, high);
 
        // reverse the whole text
        reverseText(chars, 0, chars.length - 1);
 
        return new String(chars);
    }
 
    public static void main(String[] args)
    {
        String str = "Preparation Interview Technical";
 
        System.out.println(reverseText(str));
    }
}