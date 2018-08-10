package com.visa.project.domain;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Test {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int testId;
	@ManyToOne(cascade=(CascadeType.PERSIST),fetch=FetchType.EAGER)
	@JoinColumn(name="creatorEmailId",nullable=false)
	TestCreator testCreator;
	@NotNull
	String titleOfTest;
	String description;
	@NotNull
	String testLink;
	@OneToMany(mappedBy="test", fetch= FetchType.EAGER)
	List<Question> questions;
	@OneToMany(mappedBy="test")
	List<Submission> submission;
	
	public Test(){
		
	}
	
	public Test(String titleOfTest, String description){
		super();
		this.titleOfTest = titleOfTest;
		this.description = description;	
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public TestCreator getTestCreator() {
		return testCreator;
	}

	public void setTestCreator(TestCreator testCreator) {
		this.testCreator = testCreator;
	}

	public String getTitleOfTest() {
		return titleOfTest;
	}

	public void setTitleOfTest(String titleOfTest) {
		this.titleOfTest = titleOfTest;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTestLink() {
		return testLink;
	}

	public void setTestLink(String testLink) {
		this.testLink = testLink;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public List<Submission> getSubmission() {
		return submission;
	}

	public void setSubmission(List<Submission> submission) {
		this.submission = submission;
	}
}
