package com.example.entity.peopleManager;

public class Repaire {

	private Integer repaired_id;

	private String d_no;

	private String repaired_item;

	private String commit_time;

	private String solve_time;
	    
	private String repaired_reason;

	public Repaire(Integer repaired_id, String d_no, String repaired_item,
			String commit_time, String solve_time, String repaired_reason) {
		super();
		this.repaired_id = repaired_id;
		this.d_no = d_no;
		this.repaired_item = repaired_item;
		this.commit_time = commit_time;
		this.solve_time = solve_time;
		this.repaired_reason = repaired_reason;
	} 
	
	public Repaire(){
		
	}

	@Override
	public String toString() {
		return "Repaire [repaired_id=" + repaired_id + ", d_no=" + d_no
				+ ", repaired_item=" + repaired_item + ", commit_time="
				+ commit_time + ", solve_time=" + solve_time
				+ ", repaired_reason=" + repaired_reason + "]";
	}

	public Integer getRepaired_id() {
		return repaired_id;
	}

	public void setRepaired_id(Integer repaired_id) {
		this.repaired_id = repaired_id;
	}

	public String getD_no() {
		return d_no;
	}

	public void setD_no(String d_no) {
		this.d_no = d_no;
	}

	public String getRepaired_item() {
		return repaired_item;
	}

	public void setRepaired_item(String repaired_item) {
		this.repaired_item = repaired_item;
	}

	public String getCommit_time() {
		return commit_time;
	}

	public void setCommit_time(String commit_time) {
		this.commit_time = commit_time;
	}

	public String getSolve_time() {
		return solve_time;
	}

	public void setSolve_time(String solve_time) {
		this.solve_time = solve_time;
	}

	public String getRepaired_reason() {
		return repaired_reason;
	}

	public void setRepaired_reason(String repaired_reason) {
		this.repaired_reason = repaired_reason;
	}
	
}
