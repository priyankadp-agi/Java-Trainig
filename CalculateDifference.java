package calculate.difference;
import java.util.Scanner;
public class CalculateDifference 
{
	public static int calculateDifference(int n)
	{
		int difference = 0;
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		int square = 0;
		for(int i = 1; i <= n; i++)
		{
			sum2 = sum2 + i;
			sum = i*i;
			sum1 = sum1+sum;
			
		}
		square = sum2 * sum2;
		difference = sum1 - square;
		return difference;
	}

	public static void main(String[] args) 
	{
		int output;
		System.out.println("enter number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(calculateDifference(num));
		

	}

}
