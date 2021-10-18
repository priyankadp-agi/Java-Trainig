public class MultiplicationTable 
{
	public static void test(int number)
	{
		int j;
		for(j = 1; j <= 10; j++)
			{
				System.out.println(number +"  *  " + j + "  =  " + number * j);
			}
		System.out.println("=========================");
	}
	
	public static void main(String[] args) 
	{
		test(13);
		test(45);
		test(79);
	}
}
