package com.bugtracker.model;

public class CurrentUser {

	private Long currentUserId;
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private boolean status;
	private Roles roles;

	public CurrentUser() {

	}

	public CurrentUser(Long currentUserId, String firstName, String lastName,
			String password, String email, boolean status,Roles roles) {
		super();
		this.currentUserId = currentUserId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.status = status;
		this.roles = roles;
	}

	public Long getCurrentUserId() {
		return currentUserId;
	}

	public void setCurrentUserId(Long currentUserId) {
		this.currentUserId = currentUserId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Roles getRoles() {
		return roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

}
