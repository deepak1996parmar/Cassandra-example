package com.example.cassandraexample.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.example.cassandraexample.model.Employee;

@Repository
public interface EmployeeRepository extends CassandraRepository<Employee, Integer> {

}
