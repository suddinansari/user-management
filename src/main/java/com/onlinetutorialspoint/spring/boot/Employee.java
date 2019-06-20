package com.onlinetutorialspoint.spring.boot;

public class Employee {
	private int id;
	private String name;
	private String department;
	private int age;
	private Manager manager;

	public Employee(int id, String name, String department, int age, Manager manager) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.age = age;
		this.manager = manager;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", age=" + age + ", manager="
				+ manager + "]";
	}

}
