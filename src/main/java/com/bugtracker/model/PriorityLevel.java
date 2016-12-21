package com.bugtracker.model;

import java.util.Set;

public class PriorityLevel {
	private Long priorityLevelId;
	private String priorityName;
	private Set<Bug> bug1;

	public PriorityLevel() {

	}

	public PriorityLevel(Long priorityLevelId, String priorityName,
			Set<Bug> bug1) {
		super();
		this.priorityLevelId = priorityLevelId;
		this.priorityName = priorityName;
		this.bug1 = bug1;
	}

	public Long getPriorityLevelId() {
		return priorityLevelId;
	}

	public void setPriorityLevelId(Long priorityLevelId) {
		this.priorityLevelId = priorityLevelId;
	}

	public String getPriorityName() {
		return priorityName;
	}

	public void setPriorityName(String priorityName) {
		this.priorityName = priorityName;
	}

	public Set<Bug> getBug1() {
		return bug1;
	}

	public void setBug1(Set<Bug> bug1) {
		this.bug1 = bug1;
	}

}
