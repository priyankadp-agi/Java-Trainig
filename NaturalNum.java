import java.util.Scanner;
public class NaturalNum 
{
	public static void test(int num)
	{
		int sum = 0;
		for(int i=1;i<=num;i++)
		{
			System.out.println(i);
			 sum+= i;
		}
		System.out.println("the sum is " +sum);
	}

	public static void main(String[] args) 
	{
		int num;
		System.out.println("enter the num");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		test(num);

	}

}
