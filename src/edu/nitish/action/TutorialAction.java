package edu.nitish.action;

import edu.nitish.service.StarterService;

public class TutorialAction {
	private String tutorialSiteName;

	public String execute() {
		StarterService starterService = new StarterService();
		setTutorialSiteName(starterService.getBestTutorialSite());
		return "success";
	}

	public String getTutorialSiteName() {
		return tutorialSiteName;
	}

	public void setTutorialSiteName(String tutorialSiteName) {
		this.tutorialSiteName = tutorialSiteName;
	}
}
