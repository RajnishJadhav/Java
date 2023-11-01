package com.demo.test;
import com.demo.service.*;
import java.util.Scanner;
public class PersonTest {

	public static void main(String[] args) 
	{
		PersonService ps = new PersonServiceImpl();
		Scanner sc=new Scanner(System.in);
		int choice=0;

		do {
			System.out.println("Enter 1 for create person");
			System.out.println("Enter 2 for displayAll");
			System.out.println("Enter 3 for displayById");
			System.out.println("exit\n");
			choice=sc.nextInt();
			switch(choice){

			case 1:
				ps.createPerson();
				break;
			case 2:
				ps.displayAll();
				break;
			case 3:
				ps.displayById();
				break;
			case 4:
				System.out.println("Bye....");
				sc.close();
				break;
			default:
				System.out.println("Please enter valid option...");

			}
		}while(choice!=4);



	}

}
