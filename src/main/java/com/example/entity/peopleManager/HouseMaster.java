package com.example.entity.peopleManager;

public class HouseMaster {

    private Integer h_id;

    private String h_no;

    private String h_password;

    private String h_name;

    private String h_sex;

    private String h_tel;

    private String h_dorm_build_no;
    

    public HouseMaster(Integer h_id, String h_no, String h_password,
			String h_name, String h_sex, String h_tel, String h_dorm_build_no) {
		super();
		this.h_id = h_id;
		this.h_no = h_no;
		this.h_password = h_password;
		this.h_name = h_name;
		this.h_sex = h_sex;
		this.h_tel = h_tel;
		this.h_dorm_build_no = h_dorm_build_no;
	}

	public HouseMaster() {
    }

	
    @Override
	public String toString() {
		return "HouseMaster [h_id=" + h_id + ", h_no=" + h_no + ", h_password="
				+ h_password + ", h_name=" + h_name + ", h_sex=" + h_sex
				+ ", h_tel=" + h_tel + ", h_dorm_build_no=" + h_dorm_build_no
				+ "]";
	}

    public Integer getH_id() {
		return h_id;
	}

	public void setH_id(Integer h_id) {
		this.h_id = h_id;
	}

	public String getH_no() {
		return h_no;
	}

	public void setH_no(String h_no) {
		this.h_no = h_no;
	}

	public String getH_password() {
		return h_password;
	}

	public void setH_password(String h_password) {
		this.h_password = h_password;
	}

	public String getH_name() {
		return h_name;
	}

	public void setH_name(String h_name) {
		this.h_name = h_name;
	}

	public String getH_sex() {
		return h_sex;
	}

	public void setH_sex(String h_sex) {
		this.h_sex = h_sex;
	}

	public String getH_tel() {
		return h_tel;
	}

	public void setH_tel(String h_tel) {
		this.h_tel = h_tel;
	}

	public String getH_dorm_build_no() {
		return h_dorm_build_no;
	}

	public void setH_dorm_build_no(String h_dorm_build_no) {
		this.h_dorm_build_no = h_dorm_build_no;
	}

}
