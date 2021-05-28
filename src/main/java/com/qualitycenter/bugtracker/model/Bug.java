package com.qualitycenter.bugtracker.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="bug_tbl")
public class Bug {
	@Id
	@GeneratedValue
	private long bug_id;
	@NotNull
	private String bug_summary;
	private String bug_desc;
	private String bug_steps;
	private long bug_rep_by;
	private long bug_ass_to;
	private long mod_id;
	private LocalDateTime creationDate;
	private LocalDateTime modifiedDate;
	private String bug_comments;
	private String attach_id;

	public long getBug_id() {
		return bug_id;
	}

	public void setBug_id(long bug_id) {
		this.bug_id = bug_id;
	}

	public String getBug_summary() {
		return bug_summary;
	}

	public void setBug_summary(String bug_summary) {
		this.bug_summary = bug_summary;
	}

	public String getBug_desc() {
		return bug_desc;
	}

	public void setBug_desc(String bug_desc) {
		this.bug_desc = bug_desc;
	}

	public String getBug_steps() {
		return bug_steps;
	}

	public void setBug_steps(String bug_steps) {
		this.bug_steps = bug_steps;
	}

	public long getBug_rep_by() {
		return bug_rep_by;
	}

	public void setBug_rep_by(long bug_rep_by) {
		this.bug_rep_by = bug_rep_by;
	}

	public long getBug_ass_to() {
		return bug_ass_to;
	}

	public void setBug_ass_to(long bug_ass_to) {
		this.bug_ass_to = bug_ass_to;
	}

	public long getMod_id() {
		return mod_id;
	}

	public void setMod_id(long mod_id) {
		this.mod_id = mod_id;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getBug_comments() {
		return bug_comments;
	}

	public void setBug_comments(String bug_comments) {
		this.bug_comments = bug_comments;
	}

	public String getAttach_id() {
		return attach_id;
	}

	public void setAttach_id(String attach_id) {
		this.attach_id = attach_id;
	}

}
