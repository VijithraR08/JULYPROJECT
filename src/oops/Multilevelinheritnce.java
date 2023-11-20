package oops;

class Animal
{
	public void animaldetails()
	{
		System.out.println("animaldetails");
	}
}

class Dog extends Animal
{
	public void dogfood()
	{
		System.out.println("dog food");
	}
}
class Babydog extends Dog
{
	public void babydogmthd()
	{
		System.out.println("babydog");
	}
}

public class Multilevelinheritnce {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.animaldetails();
		d.dogfood();
		Babydog b=new Babydog();
		b.animaldetails();
		b.dogfood();
		b.babydogmthd();

	}

}
