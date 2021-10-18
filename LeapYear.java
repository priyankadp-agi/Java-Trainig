import java.util.Scanner;
public class LeapYear 
{
	public static void test(int year)
	{
		if((year%4 == 0) && (year%100 != 0) || (year%400 == 0))
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}
	}

	public static void main(String[] args) 
	{
		int year;
		System.out.println("enter a year");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		test(year);
				
	}

}
