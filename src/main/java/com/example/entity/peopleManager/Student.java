package com.example.entity.peopleManager;

public class Student {

	    private String s_no;

	    private String s_name;

	    private String s_sex;

	    private String s_tel;

	    private String s_major;
	    
	    private String t_name;

		public Student(String s_no, String s_name, String s_sex, String s_tel,
				String s_major, String t_name) {
			super();
			this.s_no = s_no;
			this.s_name = s_name;
			this.s_sex = s_sex;
			this.s_tel = s_tel;
			this.s_major = s_major;
			this.t_name = t_name;
		}
		public Student(){
			
		}
		@Override
		public String toString() {
			return "Student [s_no=" + s_no + ", s_name=" + s_name + ", s_sex="
					+ s_sex + ", s_tel=" + s_tel + ", s_major=" + s_major
					+ ", t_name=" + t_name + "]";
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

		public String getS_sex() {
			return s_sex;
		}

		public void setS_sex(String s_sex) {
			this.s_sex = s_sex;
		}

		public String getS_tel() {
			return s_tel;
		}

		public void setS_tel(String s_tel) {
			this.s_tel = s_tel;
		}

		public String getS_major() {
			return s_major;
		}

		public void setS_major(String s_major) {
			this.s_major = s_major;
		}

		public String getT_name() {
			return t_name;
		}

		public void setT_name(String t_name) {
			this.t_name = t_name;
		}
	    
}
