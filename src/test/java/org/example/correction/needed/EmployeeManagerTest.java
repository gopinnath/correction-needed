package org.example.correction.needed;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class EmployeeManagerTest {

	private EmployeeManager app;
	
	@Before
	public void setup()	{
		app = new EmployeeManager();
		app.setEmployees(Arrays.asList(new Employee(1,"Edward","Admin","Senior Executive",15000d,LocalDate.of(2000,4,15)),
				new Employee(2,"Alice","Admin","Executive",7000d,LocalDate.of(2000,4,15)),
				new Employee(3,"Bob","HR","Associate Executive",5000d,LocalDate.of(2000,4,15)),
				new Employee(4,"Charlie","HR","Executive",7000d,LocalDate.of(2000,4,15)),
				new Employee(5,"David","IT","Senior Executive",15000d,LocalDate.of(2000,4,15)),
				new Employee(6,"Edward","HR","Executive",7000d,LocalDate.of(2000,4,15)),
				new Employee(7,"Alice","HR","Executive",7000d,LocalDate.of(2000,4,15)),
				new Employee(8,"Bob","IT","Executive",7000d,LocalDate.of(2000,4,15)),
				new Employee(9,"Charlie","Admin","Executive",7000d,LocalDate.of(2000,4,15)),
				new Employee(10,"David","Admin","Associate Executive",7000d,LocalDate.of(2000,4,15)))
			);
	}
	
	@Test
	public void getEmployeeByIdTest()	{
		Employee expectEmployee = new Employee(8,"Bob","IT","Executive",7000d,LocalDate.of(2000,4,15));
		assertEquals(expectEmployee,app.getEmployeeById(8));
	}
	
	@Test
	public void getSortedEmployeesByDepartmentAndNameTest()	{
		assertEquals(getExpectedSortedList(),app.getSortedEmployeesByDepartmentAndName());
	}
	
	private List<Employee> getExpectedSortedList()	{
		return Arrays.asList(new Employee(2,"Alice","Admin","Executive",7000d,LocalDate.of(2000,4,15)),
				new Employee(9,"Charlie","Admin","Executive",7000d,LocalDate.of(2000,4,15)),
				new Employee(10,"David","Admin","Associate Executive",7000d,LocalDate.of(2000,4,15)),
				new Employee(1,"Edward","Admin","Senior Executive",15000d,LocalDate.of(2000,4,15)),
				new Employee(7,"Alice","HR","Executive",7000d,LocalDate.of(2000,4,15)),
				new Employee(3,"Bob","HR","Associate Executive",5000d,LocalDate.of(2000,4,15)),
				new Employee(4,"Charlie","HR","Executive",7000d,LocalDate.of(2000,4,15)),
				new Employee(6,"Edward","HR","Executive",7000d,LocalDate.of(2000,4,15)),
				new Employee(8,"Bob","IT","Executive",7000d,LocalDate.of(2000,4,15)),
				new Employee(5,"David","IT","Senior Executive",15000d,LocalDate.of(2000,4,15)));
	}
}
