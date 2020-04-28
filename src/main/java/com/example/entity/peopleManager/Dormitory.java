package com.example.entity.peopleManager;

public class Dormitory {
	
	private String d_no;
	
	private String s_no;

    private String s_name;

    private String is_dorm_header;

    private String floor;

	public Dormitory(String d_no, String s_no, String s_name,
			String is_dorm_header, String floor) {
		super();
		this.d_no = d_no;
		this.s_no = s_no;
		this.s_name = s_name;
		this.is_dorm_header = is_dorm_header;
		this.floor = floor;
	}
	public Dormitory(){
		
	}
	
	@Override
	public String toString() {
		return "Dormitory [d_no=" + d_no + ", s_no=" + s_no + ", s_name="
				+ s_name + ", is_dorm_header=" + is_dorm_header + ", floor="
				+ floor + "]";
	}

	public String getD_no() {
		return d_no;
	}

	public void setD_no(String d_no) {
		this.d_no = d_no;
	}

	public String getS_no() {
		return s_no;
	}

	public void setS_no(String s_no) {
		this.s_no = s_no;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getIs_dorm_header() {
		return is_dorm_header;
	}

	public void setIs_dorm_header(String is_dorm_header) {
		this.is_dorm_header = is_dorm_header;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}
    
}
