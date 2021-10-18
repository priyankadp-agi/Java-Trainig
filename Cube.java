import java.util.Scanner;
public class Cube
{

	public static void main(String[] args) 
	{
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 1; i<= num; i++)
		{
			System.out.println(i*i*i);
		}
	

	}

}
