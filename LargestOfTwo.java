import java.util.Scanner;
public class LargestOfTwo 
{
	public static void test(int a, int b)
	{
		if(a>b)
		{
			System.out.println("a is greater than b");
		}
		else
		{
			System.out.println("a is lesser than b");
		}
	}

	public static void main(String[] args) 
	{
		int a,b;
		System.out.println("enter the values of a and b");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		test(a,b);
	}

}
