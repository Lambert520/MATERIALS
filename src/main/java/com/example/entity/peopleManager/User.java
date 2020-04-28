package com.example.entity.peopleManager;

import org.springframework.context.annotation.Bean;

import java.util.UUID;

public class User {
	
	private Integer u_id;
	  
	private String u_no;
	  
	private String u_password;
	  
	private String u_name;

	public User(Integer u_id, String u_no, String u_password, String u_name) {
		super();
		this.u_id = u_id;
		this.u_no = u_no;
		this.u_password = u_password;
		this.u_name = u_name;
	}
	
	public User(){
		
	}

	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_no=" + u_no + ", u_password="
				+ u_password + ", u_name=" + u_name + "]";
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
	  
	  

//    private Integer id;
//
//    private String jobNum;
//
//    private String passWord;
//
//    private String userName;
//
//    private String userTel;
//
//    private String userSex;
//
//    private String deptNum;
//
//    private String deptName;
//
//    private String job;
//
//    public User() {
//    }
//
//    public User(Integer id, String jobNum, String passWord, String userName, String userTel, String userSex, String deptNum, String deptName, String job) {
//        this.id = id;
//        this.jobNum = jobNum;
//        this.passWord = passWord;
//        this.userName = userName;
//        this.userTel = userTel;
//        this.userSex = userSex;
//        this.deptNum = deptNum;
//        this.deptName = deptName;
//        this.job = job;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", jobNum='" + jobNum + '\'' +
//                ", passWord='" + passWord + '\'' +
//                ", userName='" + userName + '\'' +
//                ", userTel='" + userTel + '\'' +
//                ", userSex='" + userSex + '\'' +
//                ", deptNum='" + deptNum + '\'' +
//                ", deptName='" + deptName + '\'' +
//                ", job='" + job + '\'' +
//                '}';
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getJobNum() {
//        return jobNum;
//    }
//
//    public void setJobNum(String jobNum) {
//        this.jobNum = jobNum;
//    }
//
//    public String getPassWord() {
//        return passWord;
//    }
//
//    public void setPassWord(String passWord) {
//        this.passWord = passWord;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getUserTel() {
//        return userTel;
//    }
//
//    public void setUserTel(String userTel) {
//        this.userTel = userTel;
//    }
//
//    public String getUserSex() {
//        return userSex;
//    }
//
//    public void setUserSex(String userSex) {
//        this.userSex = userSex;
//    }
//
//    public String getDeptNum() {
//        return deptNum;
//    }
//
//    public void setDeptNum(String deptNum) {
//        this.deptNum = deptNum;
//    }
//
//    public String getDeptName() {
//        return deptName;
//    }
//
//    public void setDeptName(String deptName) {
//        this.deptName = deptName;
//    }
//
//    public String getJob() {
//        return job;
//    }
//
//    public void setJob(String job) {
//        this.job = job;
//    }
}
