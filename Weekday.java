import java.util.Scanner;
public class Weekday 
{
	public static void test(int num)
	{
		switch(num)
		{
		case(1):System.out.println("Monday");
				break;
		case(2):System.out.println("Tuesday");
				break;
		case(3):System.out.println("Wedday");
				break;
		case(4):System.out.println("Thursday");
				break;
		case(5):System.out.println("Friday");
				break;
		case(6):System.out.println("Satday");
				break;
		case(7):System.out.println("Sunday");
		}
	}

	public static void main(String[] args) 
	{
		int num;
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num>1 && num<=7)
		{
			test(num);
		}
		else
		{
			System.out.println("enter a number between 1 and 7");
		}
		
	}

}
