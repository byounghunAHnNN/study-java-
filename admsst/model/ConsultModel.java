package kr.happyjob.study.admsst.model;

public class ConsultModel{
			
		   private String tc_li_no;
		   private String tc_loginID;
		   private String tc_cs_date;
		   private String tc_cs_place;
		   private String tc_cs_nm;
		   private String tc_cs_ct;
		   
		public String getTc_cs_ct() {
			return tc_cs_ct;
		}
		public void setTc_cs_ct(String tc_cs_ct) {
			this.tc_cs_ct = tc_cs_ct;
		}
		@Override
		public String toString() {
			return "ConsultModel [tc_cs_ct=" + tc_cs_ct + "]";
		}
		public String getTc_li_no() {
			return tc_li_no;
		}
		public void setTc_li_no(String tc_li_no) {
			this.tc_li_no = tc_li_no;
		}
		public String getTc_loginID() {
			return tc_loginID;
		}
		public void setTc_loginID(String tc_loginID) {
			this.tc_loginID = tc_loginID;
		}
		public String getTc_cs_date() {
			return tc_cs_date;
		}
		public void setTc_cs_date(String tc_cs_date) {
			this.tc_cs_date = tc_cs_date;
		}
		public String getTc_cs_place() {
			return tc_cs_place;
		}
		public void setTc_cs_place(String tc_cs_place) {
			this.tc_cs_place = tc_cs_place;
		}
		public String getTc_cs_nm() {
			return tc_cs_nm;
		}
		public void setTc_cs_nm(String tc_cs_nm) {
			this.tc_cs_nm = tc_cs_nm;
		}
	
	

}
