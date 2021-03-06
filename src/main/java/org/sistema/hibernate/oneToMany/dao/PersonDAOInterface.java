package org.sistema.hibernate.oneToMany.dao;

import java.util.List;

import org.sistema.hibernate.oneToMany.models.Person;

/**
 * interface for PersonDAO class
 * @author Eugenia Pérez
 * @email eugenia_perez@cuatrovientos.org
 */
public interface PersonDAOInterface {
	
	public Person selectById(Long id);
	public List<Person> selectAll ();
	public void insert (Person person);
	public void update (Person person);
	public void delete (Person person);

}
