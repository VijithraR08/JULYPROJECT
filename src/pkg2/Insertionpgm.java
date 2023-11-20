package pkg2;
import java.util.Scanner;
public class Insertionpgm {

	public static void main(String[] args) {
		
		String s="Java 3.0";
		String s1="Tutorial";
		int middle=s.length()/2;
		String firstpart=s.substring(0,middle);
		String secondpart=s.substring(middle);
		String modifiedpart=firstpart + "Tutorial" + secondpart;
		System.out.println("Modifiedstring:"+modifiedpart);

	}

}
