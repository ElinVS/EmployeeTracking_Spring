package com.codeclan.example.employeetracking;

import com.codeclan.example.employeetracking.models.Employee;
import com.codeclan.example.employeetracking.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeetrackingApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee david = new Employee("david",30,123456,"david@gmail.com");
		employeeRepository.save(david);
	}




}
