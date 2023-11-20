package oops;
class Employee2
{
	private String empname;
	private int empid;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
}

public class Encapsulationpgm {

	public static void main(String[] args) {
		Employee2 emp=new Employee2();
		emp.setEmpid(101);
		emp.setEmpname("abc");
		System.out.println(emp.getEmpid());
		System.out.println(emp.getEmpname());

	}

}
