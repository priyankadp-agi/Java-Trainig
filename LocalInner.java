
public class LocalInner 
{
	private int num = 46;
	void show()
	{
		class Local
		{
			void display()
			{
				System.out.println("Hi......");
			}
		}
		Local l = new Local();
		l.display();
	}

	public static void main(String[] args) 
	{
		LocalInner li = new LocalInner();
				li.show();
		

	}

}
