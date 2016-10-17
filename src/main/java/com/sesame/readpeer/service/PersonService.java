package com.sesame.readpeer.service;

import com.sesame.readpeer.model.Person;

public interface PersonService {
	public Person getRandom();
	public Person getById(Long id);
	public void save(Person person);
}
