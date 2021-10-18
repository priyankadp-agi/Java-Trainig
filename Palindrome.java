import java.util.Scanner;
public class Palindrome 
{
	public static void main(String[] args) 
	{
		int num;
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int temp = num;
		int remainder = 0;
		int sum = 0;
		while(num != 0)
		{
			remainder = num % 10;
			num = num / 10;
			sum = (sum*10)+remainder;
		}
		if(temp == sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	
		

	}

}
