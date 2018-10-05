package com.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@org.springframework.transaction.annotation.Transactional
public class EmployeeService {
	@Autowired
	public EmployeeRepository repository;
	
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
			.buildSessionFactory();

	public List<Employee> getAllEmployees() {
		System.out.println("new");
		List<Employee> employees = new ArrayList<>();
		repository.findAll().forEach(employees::add); 
		/*Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Employee> employees = session.createQuery("FROM Employee").list();
		session.getTransaction().commit();*/
		return employees;

	}

	public Employee getEmployee(Integer empId) {
		/*Session session = factory.getCurrentSession();
		session.beginTransaction();
		Employee employee = session.get(Employee.class, empId.intValue());
		session.getTransaction().commit();*/
		//repository.save(arg0)
		Optional<Employee> emp = repository.findById(empId);
		System.out.println(emp);
		return (Employee)repository.findById(empId).orElse(null);
	}

	public void addEmployee(Employee employee) {
		Session session = factory.getCurrentSession();
		/*session.beginTransaction().commit();
		Employee emp = new Employee();
		emp.setEmpName(employee.getEmpName());
		emp.setDesignation(employee.getDesignation());
		session.save(emp);
		session.getTransaction().commit();
		System.out.println(employee.getEmpName() + " saved sucessfully.");
*/	
		repository.save(employee);
	}

}
