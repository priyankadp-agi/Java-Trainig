public class Outer 
{
	private int num = 60;
	class Inner
	{
		Inner()
		{
			
		}
		int innerNum = 20;
		void show()
		{
			System.out.println("inner variable " + innerNum);
		}
	}
	public static void main(String args[])
	{
		Outer ob = new Outer();
		System.out.println(ob.num);
		Inner in = ob.new Inner();
		in.show();
		
	}

}
