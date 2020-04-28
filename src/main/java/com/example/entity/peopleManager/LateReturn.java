package com.example.entity.peopleManager;

public class LateReturn {

	private String s_no;
	
	private String d_no;

    private String s_name;

    private String late_return_time;

    private String late_return_reason;

	public LateReturn(String s_no, String d_no, String s_name,
			String late_return_time, String late_return_reason) {
		super();
		this.s_no = s_no;
		this.d_no = d_no;
		this.s_name = s_name;
		this.late_return_time = late_return_time;
		this.late_return_reason = late_return_reason;
	}
	public LateReturn(){
		
	}
	
	
	@Override
	public String toString() {
		return "LateReturn [s_no=" + s_no + ", d_no=" + d_no + ", s_name="
				+ s_name + ", late_return_time=" + late_return_time
				+ ", late_return_reason=" + late_return_reason + "]";
	}



	public String getS_no() {
		return s_no;
	}

	public void setS_no(String s_no) {
		this.s_no = s_no;
	}

	public String getD_no() {
		return d_no;
	}

	public void setD_no(String d_no) {
		this.d_no = d_no;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getLate_return_time() {
		return late_return_time;
	}

	public void setLate_return_time(String late_return_time) {
		this.late_return_time = late_return_time;
	}

	public String getLate_return_reason() {
		return late_return_reason;
	}

	public void setLate_return_reason(String late_return_reason) {
		this.late_return_reason = late_return_reason;
	}

    
}
