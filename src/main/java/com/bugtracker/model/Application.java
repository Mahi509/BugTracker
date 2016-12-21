package com.bugtracker.model;

import java.util.Set;

public class Application {
	private Long appId;
	private String applicationName;
	private String platform;
	private Set<Bug> bug;

	public Application(Long appId, String applicationName, String platform,
			Set<Bug> bug) {
		super();
		this.appId = appId;
		this.applicationName = applicationName;
		this.platform = platform;
		this.bug = bug;
	}

	public Application() {

	}

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public Set<Bug> getBug() {
		return bug;
	}

	public void setBug(Set<Bug> bug) {
		this.bug = bug;
	}

}
