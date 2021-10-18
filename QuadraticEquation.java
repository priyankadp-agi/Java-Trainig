import java.util.Scanner;
public class QuadraticEquation 
{
	public static void test(double a, double b, double c)
	{
		double d = b*b-4.0*a*c;
		if(d>0.0)
		{
			double root1 = (-b + Math.pow(d,0.5)) / (2.0*a);
			double root2 = (-b-Math.pow(d, 0.5))/(2.0*a);
			System.out.println("roots are "+ root1 + " and " + root2);
		}
		else if(d==0.0)
		{
			double root1 = -b/(2.0*a);
			System.out.println("the roots are "+ root1);
		}
		else
		{
			System.out.println("no roots");
		}
	}

	public static void main(String[] args) 
	{
		double a,b,c;
		System.out.println("enter the value for 'a' 'b' and 'c'");
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		test(a,b,c);
		

	}

}
