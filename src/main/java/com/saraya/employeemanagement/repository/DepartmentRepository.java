package com.saraya.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saraya.employeemanagement.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
