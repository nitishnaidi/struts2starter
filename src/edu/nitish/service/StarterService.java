package edu.nitish.service;

public class StarterService {
	public String getBestTutorialSite(String lang, int age){
		return "www.google.com/"+lang.trim()+"/age/"+age;
	}
}
