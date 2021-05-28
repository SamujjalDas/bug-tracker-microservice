package com.qualitycenter.bugtracker.model;

public class BugResponseDto {
	private long bug_id;
	private String message;

	public long getBug_id() {
		return bug_id;
	}

	public void setBug_id(long bug_id) {
		this.bug_id = bug_id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
