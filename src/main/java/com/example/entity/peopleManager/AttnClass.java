package com.example.entity.peopleManager;

public class AttnClass {

	private Integer id;

	private String s_no;
	
	private String d_no;

    private String s_name;

    private String unattn_c_rsn;

    private String unattn_c_t;

    private String t_name;

	public AttnClass(String s_no, String d_no, String s_name,
			String unattn_c_rsn, String unattn_c_t) {
		super();
		this.s_no = s_no;
		this.d_no = d_no;
		this.s_name = s_name;
		this.unattn_c_rsn = unattn_c_rsn;
		this.unattn_c_t = unattn_c_t;
	}
    
    public AttnClass(){
    	
    }

	@Override
	public String toString() {
		return "AttnClass [s_no=" + s_no + ", d_no=" + d_no + ", s_name="
				+ s_name + ", unattn_c_rsn=" + unattn_c_rsn + ", unattn_c_t="
				+ unattn_c_t + "]";
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

	public String getUnattn_c_rsn() {
		return unattn_c_rsn;
	}

	public void setUnattn_c_rsn(String unattn_c_rsn) {
		this.unattn_c_rsn = unattn_c_rsn;
	}

	public String getUnattn_c_t() {
		return unattn_c_t;
	}

	public void setUnattn_c_t(String unattn_c_t) {
		this.unattn_c_t = unattn_c_t;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
}
