package classobject;
public class EmployeeTest2 
{
	public static void main(String[] args)
	{
			EmployeeTest employee1= new EmployeeTest("John",123,"12345");
			EmployeeTest employee2= new EmployeeTest("Ritee",124,"125");
			employee1.show();
			double com=employee2.print(5.0);
			System.out.println(employee2.salary+com);
	}
}