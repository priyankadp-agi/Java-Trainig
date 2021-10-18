import java.util.Scanner;

public class FindHcf   
{  
	public static void main(String[] args)   
	{  
		int hcf = 1; 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x");
		int x = sc.nextInt();
		System.out.println("enter y");
		int y = sc.nextInt();
  
		for(int i = 1; i <= x && i <= y; i++)  
		{  
  
			if(x%i==0 && y%i==0)  
  
				hcf = i;  
		}  
 
		System.out.printf("	HCF of %d and %d is: %d", x, y, hcf);  
	}  
}  
 
