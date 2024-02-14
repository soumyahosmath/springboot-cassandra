package com.example.cassandra.springbootcassandrademo.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.cassandra.springbootcassandrademo.model.Employee;

public interface EmployeeService {
	
    public Employee addEmployee(Employee employee);
	
	public List<Employee> getAllEmployees();
	
	public Employee updateEmployeeById(@PathVariable Integer id, @RequestBody Employee updateEmployee);
	
	public String deleteEmployeeById(Integer id);
	
	public Employee getEmployeeById(@PathVariable Integer id);

}
