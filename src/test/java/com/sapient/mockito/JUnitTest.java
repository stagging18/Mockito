package com.sapient.mockito;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

public class JUnitTest {

	private static Employee[] arrayOfEmps = { new Employee(1, "Jeff Bezos", 100000.0),
			new Employee(2, "Bill Gates", 200000.0), new Employee(3, "Mark Zuckerberg", 300000.0) };

	private static List<Employee> empList = Arrays.asList(arrayOfEmps);

	@Test
	public void whenIncrementSalaryForEachEmployee_thenApplyNewSalary() {

		Integer[] empIds = { 1, 2, 3, 4 };
		
		Employee employee = empList.stream().filter(e->e != null).filter(e1->e1.getSalary()>10000.0).findFirst().orElse(null);
		
		assertEquals(employee.getSalary(), new Double(200000));
	}
}
