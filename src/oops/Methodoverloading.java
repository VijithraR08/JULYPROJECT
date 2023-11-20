package oops;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading ob=new Methodoverloading();
		ob.add(20, 40);
		ob.add(15, 10.5);
		ob.add(35.4, 10);
		ob.add(5,10,15);
		

	}
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("value of c="+c);
	}
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println("value of c="+c);
	}
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println("value of c="+c);
	}
	public void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println("value of d="+d);
	}

}
