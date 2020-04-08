package com.example.cassandraexample.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cassandraexample.model.Employee;
import com.example.cassandraexample.repository.CompanyRepository;
import com.example.cassandraexample.repository.EmployeeRepository;

@RestController
@RequestMapping("/organization")
public class Controller {

	@Autowired
	EmployeeRepository repo;

	@Autowired
	CompanyRepository companyRepository;

	@PostMapping("/save-company")
	public ResponseEntity<String> saveCompany(@RequestBody com.example.cassandraexample.model.Company comp) {
		companyRepository.save(comp);
		return new ResponseEntity<String>("company data saved!", HttpStatus.OK);
	}

	@PostMapping("/save-employee")
	public ResponseEntity<String> saveEmployees(@RequestBody Employee emp) {
		repo.save(emp);
		return new ResponseEntity<String>(" employee data saved! ", HttpStatus.OK);
	}

	@GetMapping("/get-employee")
	public ResponseEntity<List<Employee>> getEmployees() {
		List<Employee> list = repo.findAll();
		return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
	}
}
