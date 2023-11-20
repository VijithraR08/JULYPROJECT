package oops;
interface Resume
{
	public void setName(String name);
	public void setEmail(String email);
	public void setPhone(String phone);
	public void addEducation(String education);
	public void addExperience(String experience);
	void display();
}

class Resume1 implements Resume
{
  private String name;
  private String email;
  private String phone;
  private String education;
  private String experience;
  
 
@Override
public void setName(String name) {
	this.name=name;
	
}

@Override
public void setEmail(String email) {
	this.email=email;	
}

@Override
public void setPhone(String phone) {
	this.phone=phone;
	
}

@Override
public void addEducation(String education) {
	this.education=education;
	
}

@Override
public void addExperience(String experience) {
	this.experience=experience;
	
}

@Override
public void display() {
	System.out.println("Name:"+name);
	System.out.println("Email:"+email);
	System.out.println("Phone:"+phone);
	System.out.println("Education:"+education);
	System.out.println("Experience:"+experience);
	
}

}
public class ResumePreparation {

	public static void main(String[] args) {
		Resume ob=new Resume1();
		ob.setName("Kiran");
		ob.setEmail("Kiran02@gmail.com");
		ob.setPhone("7891230456");
		ob.addEducation("Btech in Computerscience engineering");
		ob.addExperience("Software engineer intern - ABC Tech");
		ob.display();

	}

}
