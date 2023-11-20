package pkg2;
import java.util.Scanner;
public class Dowhileqn {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char repeat;
		do
		{
			System.out.println("enter 2 numbers");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int sum=num1+num2;
			System.out.println("sum="+sum);
			System.out.println("Do u want to perform the operation again?(y/n):");
			repeat=sc.next().charAt(0);
		}while(repeat == 'y' || repeat=='n');

	}

}
