package oops;

abstract class Cars
{
	abstract public void start();
	abstract  public void acceleration();
	abstract public void stereo();
	public void stop()
	{
		System.out.println("car stop");
	}
}

class BMWs extends Cars
{

	@Override
	public void start() {
		System.out.println("BMW start");
		
	}

	@Override
	public void acceleration() {
		System.out.println("BMW acceleration");
		
	}

	@Override
	public void stereo() {
		System.out.println("BMW stereo");
		
	}
	
}
class kia extends Cars
{

	@Override
	public void start() {
		System.out.println("Kia start");
		
	}

	@Override
	public void acceleration() {
		System.out.println("Kia acceleration");		
	}

	@Override
	public void stereo() {
		System.out.println("Kia stereo");
		
	}
	
}

public class Abstractionpgm {

	public static void main(String[] args) {
		BMWs ob=new BMWs();
		ob.start();
		ob.acceleration();
		ob.stereo();
		ob.stop();
		kia ob1=new kia();
		ob1.start();
		ob1.acceleration();
		ob1.stereo();
		ob1.stop();

	}

}
