package edu.nitish.service;

public class LoginService {
	public String getAuthentication(String uname, String pwd){
		if(uname.equals(pwd)){
			return "success";
		}
		return "failure";
	}
}
