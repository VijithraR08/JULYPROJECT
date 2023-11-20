package pkg2;

public class Methodpgm {

	public static void main(String[] args) {
	Methodpgm ob=new Methodpgm();
	int sumresult=ob.add();
	System.out.println(sumresult);
	System.out.println(ob.sub(20,10));
	ob.mul(40,2);
	ob.div();
	}

	
		
//1.Method with return type and without parameter
		
	public int add()
	{
		int a=20,b=10;
		int c=a+b;
	    return c;
	}
		
//2.Method with returntype and parameter
		
	public int sub(int a, int b)
	{
	   int c=a-b;
	   return c;
	}
		
//3.Method without returntype and with parameter
		
	public void mul(int a,int b)
	{
		int c=a*b;
		System.out.println("mul="+c);
	}
	
//4.Method without returntype and without parameter
	
	public void div()
	{
		int a=40,b=2;
		double c=a/b;
	    System.out.println("div="+c);
	}
		

	

}
