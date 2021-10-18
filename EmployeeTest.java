package classobject;
import java.util.Scanner;
public class EmployeeTest 
{
	String name;
	int empid;
	String contact;
	double salary;
	String department;
	char gender;
	String address;
	String designation;
	Scanner sc = new Scanner(System.in);

	void test()
	{
		System.out.println("enter the department");
		department = sc.nextLine();
		System.out.println("enter the gender");
		gender = sc.next().charAt(0);
		System.out.println("enter the designation");
		designation = sc.nextLine();
		System.out.println();
	}

	EmployeeTest(String name,int empid,String contact)
	{
		this.name=name;
		this.empid=empid;
		this.contact=contact;
		this.salary=0;
	}
	double print(double percentage) 
	{
		double commission= percentage/100* salary;
		return commission;

	}
	double empsalary()
	{
		System.out.println("enter the salary of the employee");
		salary = sc.nextDouble();
		return salary;
	}
	void show() 
	{
		System.out.println(name);
		System.out.println(empid);
		System.out.println(contact);
	}
	void display()
	{
		System.out.println("Total income is");
		
	}
	public static void main(String[] args)
	{
		    System.out.println("Employee1 data");
			EmployeeTest employee1= new EmployeeTest("John",123,"12345");
			employee1.show();
			employee1.test();
			employee1.empsalary();
			double com = employee1.print(20);
			employee1.display();
			System.out.println(employee1.salary + com);
			System.out.println("=====================================");
			System.out.println("Employee2 data");
			EmployeeTest employee2= new EmployeeTest("Ritee",124,"125");
			employee2.show();
			employee2.test();
			employee2.empsalary();
			double com2 = employee1.print(5.0);
			employee2.display();
			System.out.println(employee2.salary + com);
			System.out.println("=====================================");
			System.out.println("Employee3 data");
			EmployeeTest employee3= new EmployeeTest("john",197,"907554");
			employee3.show();
			employee3.test();
			employee3.empsalary();
			double com3 = employee1.print(10);
			employee3.display();
			System.out.println(employee3.salary + com);
			System.out.println("=====================================");
			System.out.println("Employee4 data");
			EmployeeTest employee4= new EmployeeTest("handy",45879,"547299");
			employee4.show();
			employee4.test();
			employee4.empsalary();
			double com4 = employee1.print(30);
			employee3.display();
			System.out.println(employee4.salary + com);
			System.out.println("=====================================");
			System.out.println("Employee5 data");
			EmployeeTest employee5= new EmployeeTest("david",6227,"122476");
			employee5.show();
			employee5.test();
			employee5.empsalary();
			double com5 = employee1.print(20);
			employee3.display();
			System.out.println(employee5.salary + com);
			
			
	}

}


