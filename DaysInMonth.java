import java.util.Scanner;
public class DaysInMonth 
{
	public static void test(int num)
	{
		if(num==1||num==3||num==5||num==7||num==8||num==10||num==12)
		{
			System.out.println("number of days are 31");
		}
		else if(num==4||num==6||num==9||num==11)
		{
			System.out.println("number of days are 30");
		}
		else
		{
			System.out.println("number of days are 28 or 29");
		}
	}
	public static void main(String[] args) 
	{
		int num;
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num>1 && num<=12)
		{
			test(num);
		}
		else
		{
			System.out.println("enter a number between 1 and 12");
		}
		

	}

}
