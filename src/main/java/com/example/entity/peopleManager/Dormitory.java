package com.example.entity.peopleManager;

public class Dormitory {

	private String id;
	private String d_no;
	
	private String dorm_build_no;

    private String floor;

	public Dormitory(String d_no, String dorm_build_no, String floor) {
		super();
		this.d_no = d_no;
		this.dorm_build_no = dorm_build_no;
		this.floor = floor;
	}
    
    public Dormitory(){
    	
    }

	@Override
	public String toString() {
		return "Dormitory [d_no=" + d_no + ", dorm_build_no=" + dorm_build_no
				+ ", floor=" + floor + "]";
	}

	public String getD_no() {
		return d_no;
	}

	public void setD_no(String d_no) {
		this.d_no = d_no;
	}

	public String getDorm_build_no() {
		return dorm_build_no;
	}

	public void setDorm_build_no(String dorm_build_no) {
		this.dorm_build_no = dorm_build_no;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
