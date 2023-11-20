package controlstmts;

public class Divisibleby5and11 {

	public static void main(String[] args) {
		int a=66;
		if(a%5==0)
			if(a%11==0)
		    {
			   System.out.println("a is divisible by both 5 and 11");
	        }
		    else
		    {
			  System.out.println("a is divsible by 5 but not by 11");
		    }
	    else
	    {
           System.out.println("a is not divisible by both");
        }
    }
}
