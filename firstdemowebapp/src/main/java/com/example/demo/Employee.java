package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Employee {
	@Id
	int code;
	String name;
	int salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int code, String name, int salary) {
		super();
		this.code = code;
		this.name = name;
		this.salary = salary;
	}

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	

}
