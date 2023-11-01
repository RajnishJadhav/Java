package com.demo.service;
import java.util.Scanner;
import com.demo.beans.Person;
import com.demo.dao.PersonDao;
import com.demo.dao.PersonDaoImpl;

public class PersonServiceImpl implements PersonService
{
   private PersonDao pd;
   public PersonServiceImpl() {
	   pd=new PersonDaoImpl();
   }
   
   public void createPerson()
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter id ");
	   int id = sc.nextInt();
	   System.out.println("Enter age ");
	   int age = sc.nextInt();
	   sc.nextLine();
	   System.out.println("Enter name ");
	   String name = sc.next();
	   Person p = new Person(id,age,name);
	   pd.save(p);
   }
   
   public void displayAll()
   {
      pd.findAll();
   }

@Override
public void displayById() {
Scanner sc = new Scanner(System.in);
System.out.println("Enter pid to be searched : ");
int uid = sc.nextInt();
pd.findById(uid);
	
}
   
}
