package com.example.cassandra.springbootcassandrademo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cassandra.springbootcassandrademo.model.Employee;
import com.example.cassandra.springbootcassandrademo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public Employee addEmployee(Employee employee) {
		empRepo.save(employee);
		return employee;
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
	}
	
	@Override
	public Employee updateEmployeeById(Integer id, Employee updateEmployee) {
		 Optional<Employee> empOptional = empRepo.findById(id);
		    
		    if (empOptional.isPresent()) {
		        Employee emp = empOptional.get();
		        emp.setName(updateEmployee.getName());
		        emp.setEmail(updateEmployee.getEmail());
		        emp.setDesignation(updateEmployee.getDesignation());
		        return empRepo.save(emp);
	}
			return updateEmployee;

}
	
	@Override
	public String deleteEmployeeById(Integer id) {
		empRepo.deleteById(id);
		return "success";
		
	}
	
	@Override
	public Employee getEmployeeById(Integer id) {
		 Optional<Employee> employeeOptional = empRepo.findById(id);
		 return employeeOptional.orElse(null);
		
	}
}
