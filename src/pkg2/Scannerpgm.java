package pkg2;

import java.util.Scanner;

public class Scannerpgm {

	public static void main(String[] args) {
		System.out.println("enter 2 numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a/b;
		System.out.println("a/b="+c);
		
		System.out.println("enter a string");
		String s=sc.next();
		System.out.println(s);

	}

}
