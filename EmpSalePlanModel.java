package kr.happyjob.study.business.model;

public class EmpSalePlanModel {
	public int getPln_no() {
		return pln_no;
	}
	public void setPln_no(int pln_no) {
		this.pln_no = pln_no;
	}
	public String getLoginID() {
		return loginID;
	}
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}
	public String getPln_ddate() {
		return pln_ddate;
	}
	public void setPln_ddate(String pln_ddate) {
		this.pln_ddate = pln_ddate;
	}
	public int getSi_cd() {
		return si_cd;
	}
	public void setSi_cd(int si_cd) {
		this.si_cd = si_cd;
	}
	public int getPln_nmt() {
		return pln_nmt;
	}
	public void setPln_nmt(int pln_nmt) {
		this.pln_nmt = pln_nmt;
	}
	public String getPln_date() {
		return pln_date;
	}
	public void setPln_date(String pln_date) {
		this.pln_date = pln_date;
	}
	public String getPln_etc() {
		return pln_etc;
	}
	public void setPln_etc(String pln_etc) {
		this.pln_etc = pln_etc;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSi_nm() {
		return si_nm;
	}
	public void setSi_nm(String si_nm) {
		this.si_nm = si_nm;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getPln_ar() {
		return pln_ar;
	}
	public void setPln_ar(String pln_ar) {
		this.pln_ar = pln_ar;
	}

	// 계획 코드 
	private int pln_no;
	// 사원 번호
	private String loginID;
	// 사원 이름
	private String name;
	// 목표 날짜
	private String pln_ddate;
	// 제품 코드
	private int si_cd;
	// 제품 이름 
	private String si_nm;
	// 목표 수량
	private int pln_nmt;
	// 계획 등록 일자
	private String pln_date;
	// 달성률 을 여따가 넣을지 아니면 그냥 앞에서 계산시킬지
	// private int 달성률 임의 이름
	// 비고
	private String pln_etc;	
	// 부서 명
	private String dept_name;
	// 달성률
	private String pln_ar;

}
