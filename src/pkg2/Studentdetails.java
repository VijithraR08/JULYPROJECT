package pkg2;

public class Studentdetails {
	
	int stid;
	String stname;
	
	public Studentdetails(int stid,String stname)
	{
		this.stid=stid;
		this.stname=stname;
	}
    public void display()
    {
    	System.out.println("stid="+stid);
    	System.out.println("stname="+stname);
    }
	public static void main(String[] args) {
		
		Studentdetails ob=new Studentdetails(101,"Aparna");
        ob.display();
	}

}
