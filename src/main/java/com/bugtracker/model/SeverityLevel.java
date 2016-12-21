package com.bugtracker.model;

import java.util.Set;

public class SeverityLevel {
	private Long severityLevelId;
	private String severityName;
	private Set<Bug> bug;

	public SeverityLevel() {

	}

	public SeverityLevel(Long severityLevelId, String severityName, Set<Bug> bug) {
		super();
		this.severityLevelId = severityLevelId;
		this.severityName = severityName;
		this.bug = bug;
	}

	public Long getSeverityLevelId() {
		return severityLevelId;
	}

	public void setSeverityLevelId(Long severityLevelId) {
		this.severityLevelId = severityLevelId;
	}

	public String getSeverityName() {
		return severityName;
	}

	public void setSeverityName(String severityName) {
		this.severityName = severityName;
	}

	public Set<Bug> getBug() {
		return bug;
	}

	public void setBug(Set<Bug> bug) {
		this.bug = bug;
	}

}
