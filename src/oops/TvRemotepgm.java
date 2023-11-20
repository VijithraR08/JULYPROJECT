package oops;
interface Tvremote
{
	public void channelup();
	public void channeldown();
	public void volumeup();
	public void volumedown();
}
interface SmartTvremote extends Tvremote
{
	
	public void bluetooth();
}
class TV implements SmartTvremote
{

	@Override
	public void channelup() {
		System.out.println("channel up");
		
	}

	@Override
	public void channeldown() {
		System.out.println("channel down");
		
	}

	@Override
	public void volumeup() {
		System.out.println("volume up");
		
	}

	@Override
	public void volumedown() {
		System.out.println("volume down");
		
	}

	@Override
	public void bluetooth() {
		System.out.println("bluetooth");
		
	}
	
}

public class TvRemotepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV ob=new TV();
		ob.channelup();
		ob.channeldown();
		ob.volumeup();
		ob.volumeup();
		ob.bluetooth();

	}

}
