import java.util.Scanner;

import day3.StudentServices;

public class StudentTest {

	public static void main(String[] args) 
	{
		int opt;
        do {
        	 System.out.println("Enter 1 for adding a new Student :");
             System.out.println("Enter 2 for displaying all Student :");
             System.out.println("Enter 3 for searching a Student by Id :");
             System.out.println("Enter 4 for searching a Student by Name :");
             System.out.println("Enter 5 for updating mobile number by id :");
             System.out.println("Enter 6 to exit :");
             Scanner sc = new Scanner(System.in);
             opt=sc.nextInt();
             
             
             switch(opt)
             {
             case 1:
             {
            	 StudentServices.AddStudents();
            	 break;
             }
             case 2:
             {
            	 StudentServices.displayStudent();
            	 break;
             }
             case 3:
             {
            	 StudentServices.searchId();
            	 break;
             }
             case 4:
             {
        		 System.out.println("Enter Name to be searched");
        		 String str=sc.next();
            	 StudentServices.getByName(str);
            	 break;
             }
             case 5:
             {
            	 StudentServices.searchId();	
                 break;
             }
             case 6:
             {
            	 System.exit(0);
             }
             }
            
        }
        while(opt != 6);
	}

}
