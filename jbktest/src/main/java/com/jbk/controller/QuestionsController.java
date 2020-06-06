package com.jbk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("testapi")
public class QuestionsController {
	
<<<<<<< HEAD
	public Question getQuestions() {  // this is a just dumy code...
=======
	public Question getQuestions() {  // this is a just dumy code
>>>>>>> branch 'master' of https://github.com/Pranay-Jai/jbktestAPI.git
		Question question=new Question();
		question.setQuestionText("java is platform independent...");
		question.setOption1("Yes");
		question.setOption2("No");
		question.setCorrectoption("1");
		question.setExplanation("due to byte code...which is os independent...");
		return question;
		
	}
	
}
