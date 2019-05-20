package com.sapient.mockito;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;



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
