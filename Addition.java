package addition.of.num;
public class Addition 
{
	int num1,num2;
	int result;
	public void perform() 
	{
		result = num1 + num2;
		System.out.println(result);
	}
	public static void main(String[] args) 
	{
		Addition add = new Addition();
		add.num1 = 3;
		add.num2 = 5;
		add.perform();
	}
}
