package oops;
class Member
{
	String name;
	int age;
	String phoneno;
	String address;
	public void printdetails()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("phoneno="+phoneno);
		System.out.println("address="+address);
	}
}

class Employee extends Member
{
	String specialization;
}
class Manager extends Member
{
	String department;
}

public class Inheritancepgm {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.name="Arya";
		emp1.age=23;
		emp1.phoneno="98765432100";
		emp1.address="abc";
		emp1.printdetails();
		Manager mg=new Manager();
		mg.name="Arav";
		mg.age=28;
		mg.phoneno="1230457896";
		mg.address="cdf";
		mg.printdetails();
		
	}

}

