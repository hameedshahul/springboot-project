package com.example.demo.users;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.jetbrains.annotations.Nullable;

@Entity
public class Users {
	

	@Id
	@Nullable
	private String username;
	private String firstname;
	private String lastname;
	private String useremail;
	private String password;
	

	public Users() {
		
	}
	
	public Users(String username, String firstname, String lastname, String useremail, String password) {
		super();
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.useremail = useremail;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
