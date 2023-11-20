package pkg2;
import java.util.Scanner;
public class Countofelements {

	public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements");
	n=sc.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter the array of integers");
	for(int i=0;i<n;i++) 
	{
		arr[i]=sc.nextInt();
	}
	int evencount=0;
	int oddcount=0;
	for(int i=0;i<n;i++)
	{
		if(arr[i]%2==0) 
		{
			evencount++;
		}
		else
		{
			oddcount++;
		}
	}
	System.out.println("Number of even numbers="+evencount);
	System.out.println("Number of odd numbers="+oddcount);
	
	}

}
