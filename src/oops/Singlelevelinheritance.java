package oops;

class Animals
{
	public void animaldetails()
	{
		System.out.println("animaldetails");
	}
}

class Dogs extends Animals
{
	public void dogfood()
	{
		System.out.println("dog food");
	}
}

public class Singlelevelinheritance {

	public static void main(String[] args) {
		Dogs d=new Dogs();
		d.animaldetails();
		d.dogfood();
	}

}
