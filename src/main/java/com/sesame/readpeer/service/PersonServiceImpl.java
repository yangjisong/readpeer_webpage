package com.sesame.readpeer.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sesame.readpeer.dao.PersonDAO;
import com.sesame.readpeer.model.Person;

//@Service
public class PersonServiceImpl implements PersonService {

	@Autowired 
    private PersonDAO personDAO;
	String[] names = {"Nikolaus Otto", "Robert Ford", "Gottlieb Daimler", "Lt. General Masaharu Homma"};

	@Override
	public Person getRandom() {
		Person person = new Person();
		person.setName(randomName());
		person.setAge(randomAge());
		return person;
	}

	@Override
	public Person getById(Long id) {
		Person person = new Person();
		personDAO.getPerson(id.intValue());
		return person;
	}
	
	@Override
	public void save(Person person) {
		if(person.getId() !=0){
		    personDAO.update(person.getId(),person.getName(), person.getAge());
		}else{
			personDAO.create(person.getName(), person.getAge());
		}
	}
	
	private Integer randomAge() {
		Random random = new Random();
		return 10 + random.nextInt(100);
	}

	private String randomName() {
		Random random = new Random();
		return names[random.nextInt(names.length)];
	}

}
