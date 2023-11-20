package controlstmts;

public class Countofdigits {

	public static void main(String[] args) {
		int num=7825;
		int	count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("count of digits="+count);

	}

}
