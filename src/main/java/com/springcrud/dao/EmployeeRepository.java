package com.springcrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.springcrud.entity.Employee;


@RepositoryRestResource(path="emps")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// crud functions findAll() , findById() , save() , deleteById() 
}
