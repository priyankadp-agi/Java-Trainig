import java.util.Scanner;
public class LargestOfThree 
{
	public static void test(int a,int b,int c)
	{
		if(a>b && a>c)
		{
			System.out.println("a is greater than b and c");
		}
		else if(b>c && b>a)
		{
			System.out.println("b is greater than a and c");
		}
		else
		{
			System.out.println("c is greater than a and b");
		}
    }

	public static void main(String[] args) 
	{
		int a,b,c;
		System.out.println("enter the values of 'a' 'b' and 'c'");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		test(a,b,c);
	}

}


