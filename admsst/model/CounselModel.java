package kr.happyjob.study.admsst.model;

public class CounselModel{
	
	private String li_nm;
	private String li_date;
	private String li_no;

	private String name;
	private int score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getLi_no() {
		return li_no;
	}
	public void setLi_no(String li_no) {
		this.li_no = li_no;
	}
	public String getLi_nm() {
		return li_nm;
	}
	public void setLi_nm(String li_nm) {
		this.li_nm = li_nm;
	}
	public String getLi_date() {
		return li_date;
	}
	public void setLi_date(String li_date) {
		this.li_date = li_date;
	}
	@Override
	public String toString() {
		return "CounselModel [name=" + name + ", score=" + score + "]";
	}
	
	

}
