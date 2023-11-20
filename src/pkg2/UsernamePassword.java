package pkg2;
import java.util.Scanner;
public class UsernamePassword {

	public static void main(String[] args) {
		String[][] arr=new String[4][2];
		Scanner sc=new Scanner(System.in);
        System.out.println("enter username and password");
        for(int i=0;i<4;i++)
        {
        	for(int j=0;j<2;j++)
        	{
        		arr[i][j]=sc.next();
        	}
        }
        for(int i=0;i<4;i++)
        {
        	for(int j=0;j<2;j++)
        	{
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }


       
	}

}
