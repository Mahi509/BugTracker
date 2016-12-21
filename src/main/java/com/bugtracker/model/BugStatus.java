package com.bugtracker.model;

import java.util.Set;

public class BugStatus {
	private Long bugStatusId;
	private String bugStatusName;
	private Set<Bug> bug2;

	public BugStatus() {

	}

	public BugStatus(Long bugStatusId, String bugStatusName, Set<Bug> bug2) {
		super();
		this.bugStatusId = bugStatusId;
		this.bugStatusName = bugStatusName;
		this.bug2 = bug2;
	}

	public Long getBugStatusId() {
		return bugStatusId;
	}

	public void setBugStatusId(Long bugStatusId) {
		this.bugStatusId = bugStatusId;
	}

	public String getBugStatusName() {
		return bugStatusName;
	}

	public void setBugStatusName(String bugStatusName) {
		this.bugStatusName = bugStatusName;
	}

	public Set<Bug> getBug2() {
		return bug2;
	}

	public void setBug2(Set<Bug> bug2) {
		this.bug2 = bug2;
	}

}
