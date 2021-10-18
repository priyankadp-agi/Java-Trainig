import java.util.Scanner;
public class SumAndAverage 
{
	public static void test(int num1,int num2,int num3,int num4, int num5)
	{
		int sum = 0;
		int average = 0;
		sum = num1+num2+num3+num4+num5;
		System.out.println("sum of all numbers is "+sum);
		average = sum / 5;
		System.out.println("average of all numbers is " +average);
	}

	public static void main(String[] args) 
	{
		int num1,num2,num3,num4,num5;
		System.out.println("enter 5 numbers");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();
		test(num1,num2,num3,num4,num5);
		
		

	}

}
