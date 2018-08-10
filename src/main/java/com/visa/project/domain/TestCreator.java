package com.visa.project.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TestCreator")
public class TestCreator {

	
	@Id
	@NotNull
	String creatorEmailId;
	@NotNull
	String name;
	@NotNull
	String password;
	@OneToMany(mappedBy="testCreator",fetch= FetchType.EAGER)
	List<Test> tests;
	
	public TestCreator(){
		
	}
	
	public TestCreator(String creatorEmailId,String name, String password){
		super();
		this.creatorEmailId = creatorEmailId;
		this.name = name;
		this.password = password;
	}

	public String getCreatorEmailId() {
		return creatorEmailId;
	}

	public void setCreatorEmailId(String creatorEmailId) {
		this.creatorEmailId = creatorEmailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Test> getTests() {
		return tests;
	}

	public void setTests(List<Test> tests) {
		this.tests = tests;
	}
	
	
	

}
