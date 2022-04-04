package com.saraya.employeemanagement.services;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.saraya.employeemanagement.interfaces.MyInterface;
import com.saraya.employeemanagement.model.Employee;
import com.saraya.employeemanagement.repository.EmployeeRepository;

public class IEmployeeImpl implements MyInterface {

	@Autowired
	EmployeeRepository repo;
	
	@Override
	public Object create(Object o) {
		return repo.save((Employee) o) ;
	}

	@Override
	public List<Object> getAll() {
		
		return Collections.singletonList(repo.findAll());
	}

	@Override
	public Employee getById(Long id) {
		
		return repo.findById(id).get();
	}

	@Override
	public Object update(long id, Object o) {
		
		Employee emp = (Employee) o;
		Employee e = getById(id);
		if (e != null) {
			e.setFullName(emp.getFullName());
			e.setEmployeeNumber(emp.getEmployeeNumber());
			e.setManager(emp.isManager());
			return repo.save(e);
		}
		
		return emp;
	}

	@Override
	public void delete(Object o) {
		repo.delete((Employee) o);
		
	}

}
