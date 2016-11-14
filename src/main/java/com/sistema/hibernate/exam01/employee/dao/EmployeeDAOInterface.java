package com.sistema.hibernate.exam01.employee.dao;

import java.util.List;
import com.sistema.hibernate.exam01.employee.models.Employee;

/**
 */
public interface EmployeeDAOInterface {
	
	public Employee selectById(Long id);
	public List<Employee> selectAll ();
	public void insert (Employee employee);
	public void update (Employee employee);
	public void delete (Employee employee);

}
