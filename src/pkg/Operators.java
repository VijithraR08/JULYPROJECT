package pkg;

public class Operators {

	public static void main(String[] args) {
		
    System.out.println("-------Arithmetic operator-------");
       int a=70,b=50;
       System.out.println("a+b="+(a+b));
       System.out.println("a-b="+(a-b));
       System.out.println("a*b="+(a*b));
       System.out.println("a/b="+(a/b));
       System.out.println("a%b="+(a%b));
       
    System.out.println("-------Assignment operator------");
       System.out.println(a+=b);
       System.out.println(a-=b);
       System.out.println(a*=b);
       System.out.println(a/=b);
       System.out.println(a%=b);
     
    System.out.println("--------Relational operator--------");
       int v1=20,v2=10;
       System.out.println(v1>v2);
       System.out.println(v1>=v2);
       System.out.println(v1<v2);
       System.out.println(v1<=v2);
       System.out.println(v1!=v2);
       System.out.println(v1==v2);
       
   
    
    System.out.println("-------Logical operator--------");
    
    // A  B  A&&B  A||B  !A  !B
    // T  T   T     T     F   F
    // T  F   F     T     F   T
    // F  T   F     T     T   F
    // F  F   F     F     T   T
    
       String username="vijithra";
       String password="1234";
       System.out.println(username=="vijithra"&&password == "1234");
       System.out.println(username=="viji"||password=="1234");
       System.out.println(!(username=="vijithra"));
       
    System.out.println("------Unary operator------");
    
    // ++ increment by 1
    // -- increment by 1
    
       int v3=7;
       System.out.println(v3++);
       System.out.println(v3);
       System.out.println(++v3);
       System.out.println(v3--);
       System.out.println(v3);
       System.out.println(--v3);
       
    System.out.println("-------Ternary operator-------");
       int c=80,d=60;
       
       //variable=condition?stmt1:stmt2
       
       int an=c>d?c:d;
       System.out.println(an);
       
       String an1=c>d?"c is greater":"d is greater";
       System.out.println(an1);
    		   
       
       
    
    
	}

}
