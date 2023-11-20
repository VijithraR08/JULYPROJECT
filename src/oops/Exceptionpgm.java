package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionpgm {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream f=new FileInputStream("E://Book1.xlsx");
		
		
		try {
		int a=30,b=0;
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("arithmetic exception");
		}
        System.out.println("hello");
        
        
        
        try {
        	String s=null;
        	System.out.println(s.length());
        }
        catch(Exception e)
        {
        	System.out.println("null pointer exception");
        	System.out.println(e.getMessage());
        }
	}

}
