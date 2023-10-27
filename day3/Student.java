package day3;
import java.util.Scanner;

public class Student {

	private int sid;
	private String sname;
	private String mobile;
	
	Student()
	{
		sid=0;
		sname=null;
		mobile=null;
	}
	
	Student(int id,String nm,String mob)
	{
		sid=id;
		sname=nm;
		mobile=mob;
	}
	public int getId()
	{
		return sid;
	}
	
	public String getName()
	{
		return sname;
	}
	
	public String toString()
	{
		return "id : "+sid+" \nName : "+sname+" \nmobile :"+mobile;
	}
	
	public static void main(String[] args) 
	{
     	 StudentServices.getStudents();
		 StudentServices.displayStudent();
//		 Student s=StudentServices.searchId();
//		 System.out.println(s);
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Name to be searched");
		 String str=sc.next();
		 
		 StudentServices.getByName(str);
		 
		 
          
	}

}
