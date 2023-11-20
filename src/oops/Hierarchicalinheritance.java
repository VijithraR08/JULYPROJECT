package oops;

class Animal1
{
	public void animaldetails()
	{
		System.out.println("animaldetails");
	}
}

class Tiger extends Animal1
{
	public void tigermethod()
	{
		System.out.println("Tiger");
	}
}
class Dog1 extends Animal1
{
	public void dogmethod()
	{
		System.out.println("dog");
	}
}

public class Hierarchicalinheritance {

	public static void main(String[] args) {
		Tiger t=new Tiger();
		t.animaldetails();
		t.tigermethod();
		Dog1 d=new Dog1();
		d.animaldetails();
		d.dogmethod();
	}

}
