package com.sistema.hibernate.exam01.employee;

import com.sistema.hibernate.exam01.employee.dao.EmployeeDAO;
import com.sistema.hibernate.exam01.employee.models.Employee;
import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setName("A");
		employee1.setEmail("A@A.com");
		employee1.setSalary(90);
		
		Employee employee2 = new Employee();
		employee2.setName("B");
		employee1.setEmail("B@B.com");
		employee1.setSalary(278);
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.insert(employee1);
		employeeDAO.insert(employee2);
		employeeDAO.showAll();
		System.out.println("End");
		
			

	}

}

