package com.demo.dao;
import com.demo.beans.Person;

public class PersonDaoImpl implements PersonDao {
static Person [] parr;
private static int cnt;
static
{
	parr= new Person[10];
	parr[0]= new Person(1,22,"Pratham");
	parr[1]= new Person(2,24,"Shubham");
	parr[2]= new Person(3,23,"Rajnish");	
	cnt=3;
}

	@Override
	public void save(Person p) {
		parr[cnt]=p;
		cnt++;
	}

	@Override
	public void findAll() {
		for(Person p : parr)
		{
			if(p!=null)
			{
				System.out.println(p);
			}
		}
	}

	@Override
	public void findById(int uid) {
			for(int i=0;i<cnt;i++)
			{
				if(parr[i].getPid()==uid)
				{
					System.out.println(parr[i]);
				}
			}
	}
}
