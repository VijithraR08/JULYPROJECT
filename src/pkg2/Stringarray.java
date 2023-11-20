package pkg2;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
		String[] arr=new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.next();
		}
		
//		for(int i=0;i<5;i++)
	//	{
		//	System.out.println(arr[i]);
	//	}
        for(String name:arr)
        {
        	System.out.println(name);
        }
	}

}
