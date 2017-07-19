package com.collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public class Utenze {
	private int id;
	private String uname;
	private String upassword;
	public Utenze() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param args
	 */
	public double getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
public void setUname(String uname) {
	this.uname = uname;
}
public void setUpassword(String upassword) {
	this.upassword = upassword;
}
	public String getUname() {
		return uname;
	}

	
	public String getUpassword() {
		return upassword;
	}

	

}
