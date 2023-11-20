package pkg2;

import java.util.Scanner;

public class Arraypgm {

	public static void main(String[] args) {
		int[] arr=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers:");
		for(int i=0;i<6;i++)
		{
		 arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<6;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
