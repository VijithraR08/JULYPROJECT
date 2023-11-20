package oops;
class Car
{
	public void enginespeed()
	{
		System.out.println("car engine speed");
	}
}
class BMW extends Car
{

	@Override
	public void enginespeed() {
		// TODO Auto-generated method stub
		System.out.println("BMW engine speed");
		super.enginespeed();
	}
	
}

public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW ob=new BMW();
		ob.enginespeed();

	}

}
