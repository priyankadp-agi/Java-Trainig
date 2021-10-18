
public class GreatestOfThree 
{
	public static void test(int num1,int num2,int num3)
	{
		if(num1 > num2 && num1 > num3)
		{
			System.out.println("num1 is greatest of all");
		}
		else if(num2 > num1 && num2 > num3)
		{
			System.out.println("num2 is greatest of all");
		}
		else
		{
			System.out.println("num3 is greatest of all");
		}
	}

	public static void main(String[] args) 
	{
		test(4,5,6);
		test(9,1,4);
	}

}
