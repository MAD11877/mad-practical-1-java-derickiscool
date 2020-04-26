import java.util.Arrays;
import java.util.Scanner;



public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Please input number: "); //prompts user for base number
    int base = in.nextInt();
    
    for (int i=0; i<base+1; ++i)
    {
    	for (int j=base; j>0; --j )
    	{
    		char [] chars = new char[j];
    		Arrays.fill(chars, '*');
    		String repeated = new String(chars);
    		System.out.println(repeated); 
    		
    	}
    	
    }
    in.close();
  }
}
