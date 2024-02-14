package com.example.cassandra.springbootcassandrademo.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
public class Employee {
	
	@PrimaryKey
	private int id;
	private String name;
	private String email;
	private String designation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee() {
		super();
	}
	public Employee(int id, String name, String email, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.designation = designation;
	}
	
	

}
