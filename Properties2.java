package InheritanceExample;

public class Properties2 extends Phone
{
	void extendedProp()
	{
		System.out.println("Take Photos......");
		System.out.println("Google......");
	}

	public static void main(String[] args) 
	{
		Properties2 p = new Properties2();
		p.properties1()
		p.extendedProp();
		
	}

}
