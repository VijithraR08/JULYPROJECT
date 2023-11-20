package controlstmts;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=153,remainder,result=0;
		int n=num;
        while(n>0) //153>0  //15>0  //1>0
        {
        	remainder=n%10;//153%10=3 //15%10=5 //1
        	result=result+(remainder*remainder*remainder); //27 // 125 //1
        	n=n/10;
        }
        if(result==num)
        {
        	System.out.println("armstrong number");
        }
        else
        {
        	System.out.println("not an armstrong number");
        }
        
	}

}
