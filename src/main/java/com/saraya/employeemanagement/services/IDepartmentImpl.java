package com.saraya.employeemanagement.services;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.saraya.employeemanagement.interfaces.MyInterface;
import com.saraya.employeemanagement.model.Department;
import com.saraya.employeemanagement.repository.DepartmentRepository;

public class IDepartmentImpl  implements MyInterface {
	
	@Autowired
	DepartmentRepository repo;

	@Override
	public Object create(Object o) {	
		Department department = repo.save((Department) o);
		return department;
	}

	@Override
	public List<Object> getAll() {		
		return Collections.singletonList(repo.findAll());
	}

	@Override
	public Department getById(Long id) {		
		return repo.getById(id);
	}

	@Override
	public Object update(long id, Object o) {
		Department department = (Department) o;		
		Department d = getById(id);
		if (d != null) {
			d.setName(department.getName());
			return repo.save(d);
		}			
		
		return department;
	}

	@Override
	public void delete(Object o) {
		repo.delete((Department) o);		
		
	}

}
