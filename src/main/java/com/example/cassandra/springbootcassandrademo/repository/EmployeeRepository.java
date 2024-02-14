package com.example.cassandra.springbootcassandrademo.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.example.cassandra.springbootcassandrademo.model.Employee;
@Repository
public interface EmployeeRepository extends CassandraRepository<Employee, Integer>{

}
