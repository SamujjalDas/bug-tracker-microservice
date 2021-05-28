package com.qualitycenter.bugtracker.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pr_tbl")
public class Project {
	@Id
	@GeneratedValue
	private long pr_id;
	private String pr_name;
	//@OneToOne(mappedBy = "pr_id")
	//private Module module;

	public long getPr_id() {
		return pr_id;
	}

	public void setPr_id(long pr_id) {
		this.pr_id = pr_id;
	}

	public String getPr_name() {
		return pr_name;
	}

	public void setPr_name(String pr_name) {
		this.pr_name = pr_name;
	}

}
