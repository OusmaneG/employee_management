package com.saraya.employeemanagement.interfaces;

import java.util.List;

public interface MyInterface {
	
	Object create (Object o);
	
	List<Object> getAll();
	
	Object getById(Long id);
	
	Object update(long id, Object o);
	
	void delete (Object o);
}
