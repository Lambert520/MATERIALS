package com.example.entity.peopleManager;

public class NotReturn {

	private String s_no;
	
	private String d_no;

    private String s_name;

    private String not_return_time;

    private String not_return_reason;

	public NotReturn(String s_no, String d_no, String s_name,
			String not_return_time, String not_return_reason) {
		super();
		this.s_no = s_no;
		this.d_no = d_no;
		this.s_name = s_name;
		this.not_return_time = not_return_time;
		this.not_return_reason = not_return_reason;
	}

	public NotReturn(){
		
	}

	@Override
	public String toString() {
		return "NotReturn [s_no=" + s_no + ", d_no=" + d_no + ", s_name="
				+ s_name + ", not_return_time=" + not_return_time
				+ ", not_return_reason=" + not_return_reason + "]";
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

	public String getNot_return_time() {
		return not_return_time;
	}

	public void setNot_return_time(String not_return_time) {
		this.not_return_time = not_return_time;
	}

	public String getNot_return_reason() {
		return not_return_reason;
	}

	public void setNot_return_reason(String not_return_reason) {
		this.not_return_reason = not_return_reason;
	}
	
    
}
