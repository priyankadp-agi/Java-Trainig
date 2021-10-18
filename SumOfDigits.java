import java.util.Scanner;
public class SumOfDigits 
{
	public static void test(int num)
	{
		int rem = 0;
		int sum = 0;
		while(num!=0)
		{
			rem = num % 10;
			num = num / 10;
			sum = sum + rem;
		}
		System.out.println("sum is "+sum);
	}

	public static void main(String[] args) 
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		num = sc.nextInt();
		test(num);

	}

}
