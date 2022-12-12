package com.springjdbc1;

public class Secondspjdbc {

	private int csid;
	private String csname;
	private int cssal;
	
	public int getCsid() {
		return csid;
	}
	public void setCsid(int csid) {
		this.csid = csid;
	}
	
	public String getCsname() {
		return csname;
	}
	public void setCsname(String csname) {
		this.csname = csname;
	}
	public int getCssal() {
		return cssal;
	}
	public void setCssal(int cssal) {
		this.cssal = cssal;
	}
	@Override
	public String toString() {
		return "Secondspjdbc [csid=" + csid + ", csname=" + csname + ", cssal=" + cssal + "]";
	}
}
