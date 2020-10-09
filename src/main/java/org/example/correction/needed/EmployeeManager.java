package org.example.correction.needed;

import java.time.LocalDate;
import java.util.List;

public class EmployeeManager {

	private List<Employee> employees;
	
	public void setEmployees(List<Employee> employees)	{
		this.employees = employees;
	}
	
	public Employee getEmployeeById(Integer id)	{
		
		// Place your implementation logic here
		
		return null;
	}
	
	public List<Employee> getSortedEmployeesByDepartmentAndName()	{
		
		// Place your implementation logic here
		
		return null;
	}
	
}

class Employee	{
	
	private Integer id;
	
	private String name;
	
	private String department;
	
	private String designation;
	
	private Double salary;
	
	private LocalDate dateofJoining;

	
	public Employee(Integer id, String name, String department, String designation, Double salary,
			LocalDate dateofJoining) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.salary = salary;
		this.dateofJoining = dateofJoining;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public LocalDate getDateofJoining() {
		return dateofJoining;
	}

	public void setDateofJoining(LocalDate dateofJoining) {
		this.dateofJoining = dateofJoining;
	}	
}
