import java.util.Scanner;
public class PositiveOrNehative 
{
	public static void test(int num)
	{
		if(num>=0)
		{
			System.out.println("Positive number");
		}
		else
		{
			System.out.println("Negative number");

		}
	}
	public static void main(String args[])
	{
		int num;
		System.out.println("enter num");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		test(num);
	}


}
