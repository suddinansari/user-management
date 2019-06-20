package com.onlinetutorialspoint.bean;

public class EmployeeBean {
	private int id;
	private String name;
	private String department;
	private ManagerBean manager;

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

	public ManagerBean getManager() {
		return manager;
	}

	public void setManager(ManagerBean manager) {
		this.manager = manager;
	}

}
