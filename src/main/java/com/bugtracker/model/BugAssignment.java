package com.bugtracker.model;

public class BugAssignment {
	private Long assignmentId;
	private Bug bug;
	private User user;

	public BugAssignment() {

	}

	public BugAssignment(Long assignmentId, Bug bug, User user) {
		super();
		this.assignmentId = assignmentId;
		this.bug = bug;
		this.user = user;
	}

	public Long getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(Long assignmentId) {
		this.assignmentId = assignmentId;
	}

	public Bug getBug() {
		return bug;
	}

	public void setBug(Bug bug) {
		this.bug = bug;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
