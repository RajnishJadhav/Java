package day3;

import java.util.Scanner;

public class StudentServices {
	static Student [] s ;
	static int cnt ;
	static 
	{        
        s = new Student[10];
        s[0]= new Student(1,"Rajnish","8999");
        s[1]= new Student(2,"Shubham","9999");
        s[2]=new Student(3,"Shubham","9999");
        cnt=3;
        
	}

	
	
	
	public static void getStudents()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id for student :");
		int id= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name for student :");
		String nm= sc.nextLine();
		System.out.println("Enter mobile for student :");
		String mob= sc.next();
		s[cnt]=new Student(id,nm,mob);
		cnt++;			 
	}
	public static void displayStudent()
	{
		for(int i=0; i<cnt; i++)
		{
			System.out.println(s[i]);
		}
	}
	
	public static Student searchId()
	{
		System.out.println("Enter id to be searched : ");
		Scanner sc =new Scanner(System.in);
		int seaid=sc.nextInt();
		
		for(int i=0;i<cnt;i++)
		{
			if(seaid==s[i].getId())
			{
                  return s[i];				
			}
		}
		return null;
		
	}
	
	public static void getByName(String sName) 
	{
		
		
//		Student[] arr=new Student[10];
//		int count=0;
//		for(int i=0;i<cnt;i++) {
//			if(s[i].getName().equals(sName)) {
//			//	System.out.println("hello "+i);
//				arr[count]=s[i];
//				count++;
//				
//			}
//			
//		}
//		if(cnt>0) {
//		 System.out.println(arr);
//		}
		int c=0;
		for(Student s1:s) {
		
			if(s1!=null) {
				if((s1.getName()).equals(sName)) {
					c++;
					System.out.println(s1);
					
				}
			}
		}
		System.out.println("Count of Names is: "+c);
	}
	
	
	
}
