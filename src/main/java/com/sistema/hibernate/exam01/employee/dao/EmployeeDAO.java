package com.sistema.hibernate.exam01.employee.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sistema.hibernate.exam01.employee.HibernateSession;
import com.sistema.hibernate.exam01.employee.models.Employee;

public class EmployeeDAO implements EmployeeDAOInterface {

	/*
	 * selects one employee by Id
	 * 
	 * @param id
	 * 
	 * @return employee
	 */
	public Employee selectById(Long id) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();

		Employee employee = (Employee) session.get(Employee.class, id);

		session.close();
		return employee;
	}

	/*
	 * retrieves all employees from db
	 * 
	 * @return List of employees
	 */
	public List<Employee> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();

		List<Employee> employees = session.createQuery("from Employee").list();

		session.close();
		return employees;
	}

	public void showAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();

		List<Employee> employees = session.createQuery("from Employee").list();
	
		session.close();
		for (Employee emp : employees) {
			emp.toString();
		}
	}

	/*
	 * inserts a new employee in database retrieves generated id and sets to
	 * employee instance
	 * 
	 * @param new employee
	 */
	public void insert(Employee employee) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.persist(employee);

		session.getTransaction().commit();
		session.close();

	}

	/*
	 * updates employee
	 * 
	 * @param employee to update
	 */
	public void update(Employee employee) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.merge(employee);

		session.getTransaction().commit();
		session.close();
	}

	/*
	 * delete given employee
	 * 
	 * @param employee to delete
	 */
	public void delete(Employee employee) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.delete(employee);

		session.getTransaction().commit();
		session.close();
	}

}
