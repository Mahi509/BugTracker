package com.bugtracker.model;

import java.util.Set;

public class Bug {

	private Long bugId;
	private String bugCreationDate;
	private Set<BugAssignment> bugAssignment1;
	private PriorityLevel priorityLevel1;
	private SeverityLevel severityLevel1;
	private BugStatus busStatus1;
	private Set<BugAttachment> bugAttachment1;
	private BugCategory bugCategory1;
	private String bugDescription;
	private Application application;
	private String platform;

	public Bug() {

	}

	public Bug(Long bugId, String bugCreationDate,
			Set<BugAssignment> bugAssignment1, PriorityLevel priorityLevel1,
			SeverityLevel severityLevel1, BugStatus busStatus1,
			Set<BugAttachment> bugAttachment1, BugCategory bugCategory1,
			String bugDescription, Application application, String platform) {
		super();
		this.bugCreationDate = bugCreationDate;
		this.platform = platform;
		this.bugAssignment1 = bugAssignment1;
		this.priorityLevel1 = priorityLevel1;
		this.severityLevel1 = severityLevel1;
		this.busStatus1 = busStatus1;
		this.bugAttachment1 = bugAttachment1;
		this.bugCategory1 = bugCategory1;
		this.bugDescription = bugDescription;
		this.application = application;
		this.platform = platform;
	}

	public Long getBugId() {
		return bugId;
	}

	public void setBugId(Long bugId) {
		this.bugId = bugId;
	}

	public String getBugCreationDate() {
		return bugCreationDate;
	}

	public void setBugCreationDate(String bugCreationDate) {
		this.bugCreationDate = bugCreationDate;
	}

	public Set<BugAssignment> getBugAssignment1() {
		return bugAssignment1;
	}

	public void setBugAssignment1(Set<BugAssignment> bugAssignment1) {
		this.bugAssignment1 = bugAssignment1;
	}

	public PriorityLevel getPriorityLevel1() {
		return priorityLevel1;
	}

	public void setPriorityLevel1(PriorityLevel priorityLevel1) {
		this.priorityLevel1 = priorityLevel1;
	}

	public SeverityLevel getSeverityLevel1() {
		return severityLevel1;
	}

	public void setSeverityLevel1(SeverityLevel severityLevel1) {
		this.severityLevel1 = severityLevel1;
	}

	public BugStatus getBusStatus1() {
		return busStatus1;
	}

	public void setBusStatus1(BugStatus busStatus1) {
		this.busStatus1 = busStatus1;
	}

	public Set<BugAttachment> getBugAttachment1() {
		return bugAttachment1;
	}

	public void setBugAttachment1(Set<BugAttachment> bugAttachment1) {
		this.bugAttachment1 = bugAttachment1;
	}

	public BugCategory getBugCategory1() {
		return bugCategory1;
	}

	public void setBugCategory1(BugCategory bugCategory1) {
		this.bugCategory1 = bugCategory1;
	}

	public String getBugDescription() {
		return bugDescription;
	}

	public void setBugDescription(String bugDescription) {
		this.bugDescription = bugDescription;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

}
