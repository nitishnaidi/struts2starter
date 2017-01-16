package edu.nitish.login;

import com.opensymphony.xwork2.Action;

import edu.nitish.service.LoginService;

public class LoginAction implements Action{
	private String username;
	private String password;
	
	public String execute(){
		LoginService loginService = new LoginService();
		return loginService.getAuthentication(getUsername(), getPassword());
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
