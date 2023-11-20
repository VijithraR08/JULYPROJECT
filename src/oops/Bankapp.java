package oops;

import java.util.Scanner;

interface Bank
{
	public void accountdetails(String name);
	public void balance();
	public void withdrawal();
	public void deposit();
	
	
}
class SBI implements Bank
{
  int balance=100000;
  String name="Vijithra";
  static String bankname="SBI";
  Scanner sc=new Scanner(System.in);
  
  
	@Override
	public void accountdetails(String name) {
		System.out.println("enter your account number");
		int accountno=sc.nextInt();
		System.out.println("Your bank name=" + bankname);
		System.out.println("your name="+name);
		System.out.println("your account number=" + accountno);
		
			
	}

	@Override
	public void balance() {
		System.out.println(balance);
		
		
		
		
	}

	@Override
	public void withdrawal() {
		System.out.println("Enter your withdrawal amount");
		int withdrawal=sc.nextInt();
		balance=balance-withdrawal;
		System.out.println("your balance amount="+balance);
		
		
	}

	@Override
	public void deposit() {
		System.out.println("enter your deposit amount");
		int deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println("Your current balance="+balance);
		
	}

		
}

public class Bankapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI ob=new SBI();
		ob.accountdetails("Vijithra");
		ob.balance();
		ob.withdrawal();
		ob.deposit();
		
		

	}

}
