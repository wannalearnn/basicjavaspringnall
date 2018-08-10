package com.visa.project.domain;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int questionId;
	@ManyToOne(cascade=(CascadeType.PERSIST),fetch=FetchType.EAGER)
	@JoinColumn(name="testId",nullable=false)
	Test test;
	@NotNull
	String questionText;
	@NotNull
	int questionMarks;
	@NotNull
	int flagForMultipleChoice;
	@OneToMany(mappedBy="question")
	List<Option> options;
	@OneToMany(mappedBy="question")
	List<Submission> submission;
	
	public Question(){
		
	}
	
	public Question(String questionText, int questionMarks, int flagForMultipleChoice){
		super();
		this.questionText = questionText;
		this.questionMarks = questionMarks;
		this.flagForMultipleChoice = flagForMultipleChoice;
	}
	
	public int getQuestionId(){
		return questionId;
	}
	
	public void setQuestionId(int questionId){
		this.questionId = questionId;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public int getQuestionMarks() {
		return questionMarks;
	}

	public void setQuestionMarks(int questionMarks) {
		this.questionMarks = questionMarks;
	}

	public int getFlagForMultipleChoice() {
		return flagForMultipleChoice;
	}

	public void setFlagForMultipleChoice(int flagForMultipleChoice) {
		this.flagForMultipleChoice = flagForMultipleChoice;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public List<Submission> getSubmission() {
		return submission;
	}

	public void setSubmissionId(List<Submission> submission) {
		this.submission = submission;
	}
	
	
	
}
