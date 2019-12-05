package com.mypractice.rest.model;

import org.springframework.stereotype.Repository;

import com.mypractice.rest.model.Persons;

@Repository
public class PersonDAO {

	private static Persons list = new Persons();
    
    static
    {
        list.getPersonList().add(new Person("Lokesh", "Gupta"));
        list.getPersonList().add(new Person("Alex", "Kolenchiskey"));
        list.getPersonList().add(new Person("David", "Kameron"));
        list.getPersonList().add(new Person("White", "Johnson"));
        list.getPersonList().add(new Person("Laura", "Datt"));
        list.getPersonList().add(new Person("Paul", "Griffin"));
        
    }
     
    public Persons getAllPersons()
    {
        return list;
    }
     
    public void addPerson(Person person) {
        list.getPersonList().add(person);
    }
}
