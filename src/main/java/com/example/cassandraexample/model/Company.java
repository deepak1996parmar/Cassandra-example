package com.example.cassandraexample.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "companydetails")
public class Company {

	@Id 
	private Integer companyId;
	private String companyName;
	private String companyBranch;
	public int getCompanyId() {
		return companyId;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyBranch=" + companyBranch
				+ "]";
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyBranch() {
		return companyBranch;
	}
	public void setCompanyBranch(String companyBranch) {
		this.companyBranch = companyBranch;
	}
	public Company(int companyId, String companyName, String companyBranch) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyBranch = companyBranch;
	}
	
	public Company()
	{
		
	}	
	
}
