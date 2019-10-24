package com.test.person.api.model;

import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {

	private static Persons list = new Persons();
    
    static
    {
        list.getPersonList().add(new Person("Lokesh", "Gupta"));
        list.getPersonList().add(new Person("Alex", "Kolenchiskey"));
        list.getPersonList().add(new Person("David", "Kameron"));
    }
     
    public Persons getAllPersons()
    {
        return list;
    }
     
    public void addPerson(Person person) {
        list.getPersonList().add(person);
    }
}
