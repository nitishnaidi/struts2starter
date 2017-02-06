package edu.nitish.login;

import com.opensymphony.xwork2.ActionSupport;

import edu.nitish.service.LoginService;

public class LoginAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	
	public void validate(){
		if(username.isEmpty()){
			addFieldError("username", "Username can not be NULL");
		}
		if(password.isEmpty()){
			addFieldError("password", "Password can not be NULL");
		}
		if(username.equals("")){
			addFieldError("username", "Username can not be EMPTY");
		}
		if(password.equals("")){
			addFieldError("password", "Password can not be EMPTY");
		}
	}
	
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
