
public class Student
{
	private String name;
	private int rollNo;
	private String subject;
	
	public Student(}
	{
		name="Anay";						
		rollNo=12345;
		subject="maths";
	}
	public Student(String name, int rollNo, String subject)
	{
		this.name=name;
		this.rollNo=rollNo;
		this.subject=subject;
	}
	
	public void printStudent()
	{
		System.out.println("name ="+name,"/" +rollNo ,"/" +subject);
		
	}
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.printStudent();
	}
		
	
}

