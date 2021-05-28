package com.qualitycenter.bugtracker.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;

@Entity
@Table(name="user_tbl")
public class User_Info {
	@Id
	@GeneratedValue
	private long usr_id;
	private String usr_name;
	private String usr_password;

	public long getId() {
		return usr_id;
	}

	public void setId(long id) {
		this.usr_id = id;
	}

	public String getUsr_name() {
		return usr_name;
	}

	public void setUsr_name(String usr_name) {
		this.usr_name = usr_name;
	}

	public String getUsr_password() {
		return usr_password;
	}

	public void setUsr_password(String usr_password) {
		this.usr_password = usr_password;
	}

}
