package edu.nitish.action;

import com.opensymphony.xwork2.Action;

import edu.nitish.service.StarterService;

public class TutorialAction implements Action{
	private String tutorialSiteName;
	private String language;
	private int age;
	
	public String execute() {
		StarterService starterService = new StarterService();
		setTutorialSiteName(starterService.getBestTutorialSite(language, age));
		return SUCCESS;
	}

	public String getTutorialSiteName() {
		return tutorialSiteName;
	}

	public void setTutorialSiteName(String tutorialSiteName) {
		this.tutorialSiteName = tutorialSiteName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
