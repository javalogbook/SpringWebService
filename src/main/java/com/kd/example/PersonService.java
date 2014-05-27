package com.kd.example;

public interface PersonService {
	public Person getRandom();

	public Person getById(Long id);

	public void save(Person person);
}
