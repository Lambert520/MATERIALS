package com.example.entity.peopleManager;

import org.springframework.context.annotation.Bean;

import java.util.UUID;

public class User {
	
	private Integer u_id;
	  
	private String u_no;
	  
	private String u_password;
	  
	private String u_name;
	
	private String u_type;

	public User(Integer u_id, String u_no, String u_password, String u_name,
			String u_type) {
		super();
		this.u_id = u_id;
		this.u_no = u_no;
		this.u_password = u_password;
		this.u_name = u_name;
		this.u_type = u_type;
	}

	public User(){
		
	}

	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_no=" + u_no + ", u_password="
				+ u_password + ", u_name=" + u_name + ", u_type=" + u_type
				+ "]";
	}

	public Integer getU_id() {
		return u_id;
	}

	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}

	public String getU_no() {
		return u_no;
	}

	public void setU_no(String u_no) {
		this.u_no = u_no;
	}

	public String getU_password() {
		return u_password;
	}

	public void setU_password(String u_password) {
		this.u_password = u_password;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_type() {
		return u_type;
	}

	public void setU_type(String u_type) {
		this.u_type = u_type;
	}
	
}
