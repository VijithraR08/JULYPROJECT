package pkg2;

import java.util.Scanner;

public class Vowelcount {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.next();
		vowelCount(s1);

	}
    public static void vowelCount(String s1)
    {
    	int c=0;
    	for(int i=0;i<s1.length();i++)
    	{
    		if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
            {
            	c++;
            }
    	}
    	System.out.println("vowel count="+c);
    }
}
