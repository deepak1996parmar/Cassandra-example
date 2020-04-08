package com.example.cassandraexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cassandraexample.model.Company;


public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
