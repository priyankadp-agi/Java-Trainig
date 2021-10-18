package check.number;
import java.util.Scanner;
public class CheckNumber 
{
	public static boolean checkNumber(int num)
	{
	    if (num % 2 != 0) 
	    {
	        return false;
	     } 
	    else 
	    {

	        for (int i = 0; i <= num; i++) 
	        {

	          if (Math.pow(2, i) == num) 
	        	  return true;
	        }
	      }
	    return false;
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter number : ");
	    int number = in.nextInt();
	    System.out.println(checkNumber(number));
	    
		

	}

}
