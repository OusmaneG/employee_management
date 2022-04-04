package com.saraya.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saraya.employeemanagement.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
