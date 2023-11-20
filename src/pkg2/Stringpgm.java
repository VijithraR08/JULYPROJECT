package pkg2;

public class Stringpgm {

	public static void main(String[] args) {
		String s="Hello";
		String s1="Welcome home";
		String s2="hello";
		
//concate
		System.out.println(s.concat(s1)); //HelloWelcome
		System.out.println(1+3+s+5+4); //4Hello54
		
//contains
		System.out.println(s1.contains("home")); //true
		
//equals
		System.out.println(s.equals(s1)); //false
		System.out.println(s.equals(s2)); //false
		System.out.println(s.equalsIgnoreCase(s2)); //true
		
//length
		System.out.println(s.length());
		
//to lowercase and to uppercase
		System.out.println(s.toUpperCase());
		System.out.println(s1.toLowerCase());
		
//trim
		System.out.println(s1.trim());
		
//startswith and endswith
		System.out.println(s1.startsWith("Welcome"));
		System.out.println(s1.endsWith("home"));
		
//substring
		System.out.println(s.substring(2,5));
		
//charAt
		System.out.println(s.charAt(3));
		
//split
		String s3="Java is a highlevel language";
		String sr[]=s3.split(" ");
		for(String e:sr)
		{
			System.out.println(e);
		}
//replace
		System.out.println(s1.replace("home","house"));
		
	}

}
