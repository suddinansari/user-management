package com.onlinetutorialspoint.spring.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService empService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> findEmpByName(@RequestParam("name") String name) {
		List<Employee> nameList = empService.findByName(name);
		if (nameList != null) {
			return new ResponseEntity<>(nameList, HttpStatus.OK);
		}
		return new ResponseEntity<List<Employee>>(HttpStatus.NOT_FOUND);

	}
}
