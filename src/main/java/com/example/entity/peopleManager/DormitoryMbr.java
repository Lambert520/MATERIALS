package com.example.entity.peopleManager;

public class DormitoryMbr {

	private Integer id;
	private String d_no;
	
	private String s_no;

    private String s_name;
    
    private String s_class;
    
    private String t_name;
    
    private String is_dorm_header;

	public DormitoryMbr(String d_no, String s_no, String s_name,
			String s_class, String t_name, String is_dorm_header) {
		super();
		this.d_no = d_no;
		this.s_no = s_no;
		this.s_name = s_name;
		this.s_class = s_class;
		this.t_name = t_name;
		this.is_dorm_header = is_dorm_header;
	}

    public DormitoryMbr(){
    	
    }

	@Override
	public String toString() {
		return "DormitoryMbr [d_no=" + d_no + ", s_no=" + s_no + ", s_name="
				+ s_name + ", s_class=" + s_class + ", t_name=" + t_name
				+ ", is_dorm_header=" + is_dorm_header + "]";
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

	public String getS_class() {
		return s_class;
	}

	public void setS_class(String s_class) {
		this.s_class = s_class;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getIs_dorm_header() {
		return is_dorm_header;
	}

	public void setIs_dorm_header(String is_dorm_header) {
		this.is_dorm_header = is_dorm_header;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
