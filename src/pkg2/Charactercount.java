package pkg2;
import java.util.Scanner;
public class Charactercount {

	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.nextLine();
		int charactercount=str.length();
		System.out.println("Number of characters="+charactercount);

	}

}
