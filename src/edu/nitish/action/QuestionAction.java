package edu.nitish.action;

import com.opensymphony.xwork2.ActionSupport;

public class QuestionAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String returnString;
	private String subject;
	private String question;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String answer;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public String getOptionD() {
		return optionD;
	}

	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getReturnString() {
		return returnString;
	}

	public void setReturnString(String returnString) {
		this.returnString = returnString;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("execute...");

		this.returnString = "QuestionModel [subject=" + subject + ", question="
				+ question + ", optionA=" + optionA + ", optionB=" + optionB
				+ ", optionC=" + optionC + ", optionD=" + optionD + ", answer="
				+ answer + "]";
		return "success";
	}

	public void validate() {
		if (subject.isEmpty() || question.isEmpty() || optionA.isEmpty()
				|| optionB.isEmpty() || optionC.isEmpty() || optionD.isEmpty()
				|| answer.isEmpty()) {
			addFieldError("username", "Username can not be NULL");
		}
	}
}
