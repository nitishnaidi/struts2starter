package edu.nitish.service;

public class LoginService {
	public String getAuthentication(String uname, String pwd){
		if(uname.isEmpty() || pwd.isEmpty()){
			return "failure";
		}
		else if(uname.equals(pwd)){
			return "success";
		}
		return "failure";
	}
}
