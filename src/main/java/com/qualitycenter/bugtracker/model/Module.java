package com.qualitycenter.bugtracker.model;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mod_tbl")
public class Module {
	@Id
	@GeneratedValue
	private long mod_id;
	private String mod_name;
	private long pr_id;
	// @OneToOne(cascade = CascadeType.ALL)
	// @JoinColumn(name = "pr_id", referencedColumnName = "pr_id")
	// private Project project;

	public long getMod_id() {
		return mod_id;
	}

	public void setMod_id(long mod_id) {
		this.mod_id = mod_id;
	}

	public String getMod_name() {
		return mod_name;
	}

	public void setMod_name(String mod_name) {
		this.mod_name = mod_name;
	}

	public long getPr_id() {
		return pr_id;
	}

	public void setPr_id(long pr_id) {
		this.pr_id = pr_id;
	}

}
