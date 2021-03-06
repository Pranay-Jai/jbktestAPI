package com.jbk.controller;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Question {
	String questionText;
	String option1;
	String option2;
	String option3;
	String option4;
	String option5;
	String correctoption;
	String explanation;
	public Question() {
		super();
		// TODO Auto-generated constructor stub...
	}
	public Question(String questionText, String option1, String option2, String option3, String option4, String option5,
			String correctoption, String explanation) {
		super();
		this.questionText = questionText;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.option5 = option5;
		this.correctoption = correctoption;
		this.explanation = explanation;
	}
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getOption5() {
		return option5;
	}
	public void setOption5(String option5) {
		this.option5 = option5;
	}
	public String getCorrectoption() {
		return correctoption;
	}
	public void setCorrectoption(String correctoption) {
		this.correctoption = correctoption;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	@Override
	public String toString() {
		return "Question [questionText=" + questionText + ", option1=" + option1 + ", option2=" + option2 + ", option3="
				+ option3 + ", option4=" + option4 + ", option5=" + option5 + ", correctoption=" + correctoption
				+ ", explanation=" + explanation + "]";
	}
	
	
}
