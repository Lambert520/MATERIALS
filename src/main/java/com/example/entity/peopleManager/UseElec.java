package com.example.entity.peopleManager;

public class UseElec {

	private Integer id;

	private String s_no;
	
	private String d_no;

    private String s_name;

    private String illegal_elec_rsn;

    private String illegal_elec_t;

    private String t_name;

	public UseElec(String s_no, String d_no, String s_name,
			String illegal_elec_rsn, String illegal_elec_t) {
		super();
		this.s_no = s_no;
		this.d_no = d_no;
		this.s_name = s_name;
		this.illegal_elec_rsn = illegal_elec_rsn;
		this.illegal_elec_t = illegal_elec_t;
	}
    
    public UseElec(){
    	
    }

	@Override
	public String toString() {
		return "UseElec [s_no=" + s_no + ", d_no=" + d_no + ", s_name="
				+ s_name + ", illegal_elec_rsn=" + illegal_elec_rsn
				+ ", illegal_elec_t=" + illegal_elec_t + "]";
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

	public String getIllegal_elec_rsn() {
		return illegal_elec_rsn;
	}

	public void setIllegal_elec_rsn(String illegal_elec_rsn) {
		this.illegal_elec_rsn = illegal_elec_rsn;
	}

	public String getIllegal_elec_t() {
		return illegal_elec_t;
	}

	public void setIllegal_elec_t(String illegal_elec_t) {
		this.illegal_elec_t = illegal_elec_t;
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
