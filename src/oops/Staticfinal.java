package oops;

public class Staticfinal {
	String empname;
	static String companyname="Luminar";
	static final double pi=3.14;

	public static void main(String[] args) {
		Staticfinal ob=new Staticfinal();
		System.out.println(ob.empname="abc");
		System.out.println(companyname);
		System.out.println(companyname="luminar technolab");
		System.out.println(companyname);
		System.out.println(pi);
     
	}

}
