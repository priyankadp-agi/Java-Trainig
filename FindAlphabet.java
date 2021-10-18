import java.util.Scanner;
public class FindAlphabet
{
	public static void test(char ch)
	{
		if(ch == 'A' || ch=='E' || ch == 'I' || ch == 'O' || ch == 'U')
		{
			System.out.println(ch + " is a vowel");
		}
		else if(ch == 'a' || ch=='e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println(ch + " is a vowel");
		}
		else if(ch < 0 || ch > 0)
		{
			System.out.println("enter a character between A to Z");
		}
		else
		{
			System.out.println(ch + " is a consonant");
		}
	}

	public static void main(String[] args) 
	{
		char ch;
		System.out.println("enter a character");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		test(ch);
		
		

	}

}
