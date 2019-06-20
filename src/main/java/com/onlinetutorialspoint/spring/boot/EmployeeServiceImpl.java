package com.onlinetutorialspoint.spring.boot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public List<Employee> findByName(String name) {
		List<Employee> empList = null;
		if (name.equals("suddin")) {
			empList = new ArrayList<Employee>();
			Manager m1 = new Manager(1005, "Giris");
			Manager m2 = new Manager(1009, "Devanshu");
			Employee e1 = new Employee(101, "suddin", "DEV", 25, m1);
			Employee e2 = new Employee(104, "suddin", "IT", 28, m2);
			empList.add(e1);
			empList.add(e2);
			return empList;
		} else if (name.equals("ramesh")) {
			empList = new ArrayList<Employee>();
			Manager m1 = new Manager(006, "Raghu");
			Employee e1 = new Employee(101, "ramesh", "DEV", 25, m1);
			Employee e2 = new Employee(104, "ramesh", "IT", 28, m1);
			empList.add(e1);
			empList.add(e2);
			return empList;
		}
		return empList;
	}

}
