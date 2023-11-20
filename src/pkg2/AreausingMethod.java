package pkg2;

public class AreausingMethod {

	public static void main(String[] args) {
		AreausingMethod ob=new AreausingMethod();
		double trianglearea=ob.triangle();
		System.out.println("Area of triangle="+trianglearea);
		System.out.println((ob.circle(6)));
		ob.rectangle(8,6);
        ob.square();
	}
	
	public double triangle()
	{
		int b=10,h=5;
		double ta=0.5*b*h;
		return ta;
	}
	public double circle(int r)
	{
		double ca=3.14*r*r;
		return ca;
	}
	public void rectangle(int l,int b)
	{
		int ra=l*b;
		System.out.println("Area of rectangle="+ra);
		
	}
	public void square()
	{
		int a=25;
		double sa=a*a;
		System.out.println("Area of square="+sa);
	}

}
