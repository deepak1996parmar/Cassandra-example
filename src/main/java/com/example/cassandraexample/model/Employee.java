package com.example.cassandraexample.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;

@org.springframework.data.cassandra.core.mapping.Table
public class Employee {

	@PrimaryKey
	private Integer empId;
	private String empfirstName;
	private String emplastName;
	private String empEmail;

	public Employee() {

	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpfirstName() {
		return empfirstName;
	}

	public void setEmpfirstName(String empfirstName) {
		this.empfirstName = empfirstName;
	}

	public String getEmplastName() {
		return emplastName;
	}

	public void setEmplastName(String emplastName) {
		this.emplastName = emplastName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public Employee(Integer empId, String empfirstName, String emplastName, String empEmail) {
		super();
		this.empId = empId;
		this.empfirstName = empfirstName;
		this.emplastName = emplastName;
		this.empEmail = empEmail;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empfirstName=" + empfirstName + ", emplastName=" + emplastName
				+ ", empEmail=" + empEmail + "]";
	}

}