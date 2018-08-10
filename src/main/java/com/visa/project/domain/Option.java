package com.visa.project.domain;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="answer")
public class Option {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int optionId;
	@ManyToOne(cascade=(CascadeType.PERSIST),fetch=FetchType.EAGER)
	@JoinColumn(name="questionId",nullable=false)
	Question question;
	@NotNull
	String optionText;
	@NotNull
	int flagForCorrectOption;
	@OneToMany(mappedBy="option")
	List<Submission> submission;
	
	
	public Option(){
		
	}
	
	public Option(String optionText,int flagForCorrectOption){
		super();
		this.optionText = optionText;
		this.flagForCorrectOption = flagForCorrectOption;
	}
	
	public int getOptionId(){
		return optionId;
	}
	
	public void setOptionId(int optionId){
		this.optionId = optionId;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getOptionText() {
		return optionText;
	}

	public void setOptionText(String optionText) {
		this.optionText = optionText;
	}

	public int getFlagForCorrectOption() {
		return flagForCorrectOption;
	}

	public void setFlagForCorrectOption(int flagForCorrectOption) {
		this.flagForCorrectOption = flagForCorrectOption;
	}

	public List<Submission> getSubmission() {
		return submission;
	}

	public void setSubmission(List<Submission> submission) {
		this.submission = submission;
	}
	
	
	
	
}
