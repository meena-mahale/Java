class Student
{
	private int rollNo;
	private String name;
	public static int count=0;
	Student()
	{
		rollNo =0;	
		name= null;
		count++;
	}
	Student(int r)
	{
		rollNo = r;	
		name= null;
		count++;
	}	
	
	Student(String n)
	{
		name= n;	
		rollNo = 0;	
		count++;
	}	
	
	Student(int r,  String n)
	{
		name= n;
		rollNo = r;	
		count++;
	}
	

	public void ShowDetails()
	{
		System.out.println("Roll No is "+rollNo);
		System.out.println("name is  "+name);
		SayHello(); // non static can call static data/method;
	}
	
	public static void SayHello()
	{
		System.out.println("Hello from static Method."/*+rollNo*/); // cannot call rollNo as its it non static property/data.
		//ShowDetails(); not allowed. ShowDetails() in non-static Method
	}
	
	public static void ShowCount()
	{
		System.out.println("Total objects are "+ count);
	}
}


public class StaticExample 
{
	public static void main(String[] args)
	{

		
		 // Static method can be directly called using class name;		
		Student s0 = new Student();
		Student s1 = new Student(1);
		Student s2 = new Student("pankaj");
		Student s3 = new Student(3,"Anay");	
		
		
		System.out.println("*****************Total objects");
		s1.ShowDetails();
		s2.ShowDetails();
		s3.ShowDetails();
	
		
		s0.SayHello(); // Static method can also be called using class objects;
		s1.SayHello();
		s2.SayHello();
		s3.SayHello();		
		//Student.ShowDetails(); non static methods cannot be called directly using class name. objects need to be created first. 
		
		
		
	}
}
