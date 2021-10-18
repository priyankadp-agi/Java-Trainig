
public class Anonymous 
{

	public static void main(String[] args) 
	{
		Person p = new Person()
				{
					void eat()
						{
							System.out.println("chocolate");
						}
				};
		p.eat();
		}

}
