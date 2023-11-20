package pkg2;

import java.util.Scanner;

public class SumandAverage {

	public static void main(String[] args) {
		int sum=0;
		float avg;
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers:");
		for(int i=0;i<5;i++)
		{
		 arr[i]=sc.nextInt();
		 sum=sum+arr[i];
		}
	    
		System.out.println("sum="+sum);
		avg=sum/5;
		System.out.println("avg="+avg);
		}
		

	}


