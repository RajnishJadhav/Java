package com.demo.dao;

import com.demo.beans.Person;

public interface PersonDao 
{
   void save(Person p);
   void findAll();   
   void findById(int uid);
}
