package pkg2;

import java.util.Scanner;

public class Calculatorpgm {

	public static void main(String[] args) {
		int ch=0;
		do {
		int num1,num2,result;
		System.out.println("Enter your choice:1.Addition,2.Subtraction,3.Multiplication,4.Division");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		System.out.println("Enter a number");
		num1=sc.nextInt();
		System.out.println("Enter a number");
		num2=sc.nextInt();
		
		switch(ch) 
		{
		case 1:
			result=num1+num2;
			System.out.println("a+b="+result);
			break;
		case 2:
			result=num1-num2;
			System.out.println("a-b="+result);
			break;
		case 3:
			result=num1*num2;
			System.out.println("a*b="+result);
			break;
		case 4:
			result=num1/num2;
			System.out.println("a/b="+result);
			break;
		default:
			System.out.println("invalid choice");
		}
		}
		while(ch<=4);
	}

}
