package com.collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public class Clienti {

	public Clienti() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String codC		;
	private	String 	ragC;	
	private String 	indC;	
	public double getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	public String getCodC() {
		return codC;
	}


	public void setCodC(String codC) {
		this.codC = codC;
	}


	public String getRagC() {
		return ragC;
	}


	public void setRagC(String ragC) {
		this.ragC = ragC;
	}


	public String getIndC() {
		return indC;
	}


	public void setIndC(String indC) {
		this.indC = indC;
	}


	public String getLocC() {
		return locC;
	}


	public void setLocC(String locC) {
		this.locC = locC;
	}

	String 	locC;	

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
