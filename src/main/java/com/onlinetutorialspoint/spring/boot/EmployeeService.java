package com.onlinetutorialspoint.spring.boot;

import java.util.List;

public interface EmployeeService {
	public List<Employee> findByName(String name);
}
