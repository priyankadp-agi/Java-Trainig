import java.util.*;
public class AverageAndProduct
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num and den");
		int num = sc.nextInt();
		int den = sc.nextInt();
		int a,b,gcd, t;

		if(num > den) 
		{
			a = num;
			b = den;

		} 
		else 
		{
			b = num;
			a = den;
		}
		while(b!=0) 
		{
			t = b;
			b = a%b;
			a = t;

		}
		gcd = a;
		System.out.print(num/gcd+"/"+den/gcd);
		sc.close();
	}



}