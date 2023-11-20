package oops;

interface Phone
{
	public void call();
	public void volumeup();
}
interface Smartphone
{
	public void camera();
}

class Samsung implements Phone,Smartphone
{

	@Override
	public void call() {
		System.out.println("samsung call");
		
	}

	@Override
	public void volumeup() {
		System.out.println("samsung volumeup");
		
	}

	@Override
	public void camera() {
		System.out.println("samsung camera");
		
	}
	
}
class Iphone implements Phone
{

	@Override
	public void call() {
		System.out.println("Iphone call");
		
	}

	@Override
	public void volumeup() {
		System.out.println("Iphone volumeup");
		
		
	}
	
}

public class Interfacepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung ob=new Samsung();
		ob.call();
		ob.volumeup();
		ob.camera();
		Iphone ob1=new Iphone();
		ob1.call();
		ob1.volumeup();
		
		
		

	}

}
