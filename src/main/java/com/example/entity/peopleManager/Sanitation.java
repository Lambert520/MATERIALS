package com.example.entity.peopleManager;

public class Sanitation {
	
	private Integer sanitary_condition_id;
	
	private String d_no;

    private String tast_time;

    private String tast_result;

	public Sanitation(Integer sanitary_condition_id, String d_no,
			String tast_time, String tast_result) {
		super();
		this.sanitary_condition_id = sanitary_condition_id;
		this.d_no = d_no;
		this.tast_time = tast_time;
		this.tast_result = tast_result;
	}
    public Sanitation(){
    	
    }
	@Override
	public String toString() {
		return "Sanitation [sanitary_condition_id=" + sanitary_condition_id
				+ ", d_no=" + d_no + ", tast_time=" + tast_time
				+ ", tast_result=" + tast_result + "]";
	}
	public Integer getSanitary_condition_id() {
		return sanitary_condition_id;
	}
	public void setSanitary_condition_id(Integer sanitary_condition_id) {
		this.sanitary_condition_id = sanitary_condition_id;
	}
	public String getD_no() {
		return d_no;
	}
	public void setD_no(String d_no) {
		this.d_no = d_no;
	}
	public String getTast_time() {
		return tast_time;
	}
	public void setTast_time(String tast_time) {
		this.tast_time = tast_time;
	}
	public String getTast_result() {
		return tast_result;
	}
	public void setTast_result(String tast_result) {
		this.tast_result = tast_result;
	}
    
}
