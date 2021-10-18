package calculate;
import java.util.Scanner;
public class CalculateSum 
{
	public static int calculatesum(int num)
	{
		int sum = 0;
		for(int i = 1; i <= num; i++)
		{
			if(i%3 == 0 || i%5 == 0)
			{
				sum = sum + i;
			}
		}
		return sum;
		
	}

	public static void main(String[] args) 
	{
		int output;
		System.out.println("enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		calculatesum(num);
		System.out.println(calculatesum(num));
	

	}

}
