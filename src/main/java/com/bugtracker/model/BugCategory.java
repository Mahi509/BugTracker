package com.bugtracker.model;

import java.util.Set;

public class BugCategory {
	private Long bugCategoryId;
	private String categoryName;
	private Set<Bug> bug;

	public BugCategory() {

	}

	public BugCategory(Long bugCategoryId, String categoryName, Set<Bug> bug) {
		super();
		this.bugCategoryId = bugCategoryId;
		this.categoryName = categoryName;
		this.bug = bug;
	}

	public Long getBugCategoryId() {
		return bugCategoryId;
	}

	public void setBugCategoryId(Long bugCategoryId) {
		this.bugCategoryId = bugCategoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Set<Bug> getBug() {
		return bug;
	}

	public void setBug(Set<Bug> bug) {
		this.bug = bug;
	}

}
