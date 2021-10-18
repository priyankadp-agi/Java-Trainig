import java.util.Scanner;
public class NumAndDigit 
{
	public static void test(int num,int digit)
	{
		int rem = 0;
		int sum = 0;
		while(num!=0)
		{
			rem = num % 10;
			num = num / 10;
			sum = (sum*10) + rem;
			if(digit == rem)
			{
				System.out.println("digit is found");
			}
		}
		if(digit!=rem)
		{
			System.out.println("digit not found");
		}
		
	}

	public static void main(String[] args) 
	{
		int num,digit;
		System.out.println("enter a num");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("enter a digit");
		digit = sc.nextInt();
		test(num,digit);		

	}

}
