package com.collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public class Articoli {
	/*
	codA		varchar(15)     codice articolo
	desA               varchar(35)     descrizione
	umiA              varchar(2)       unita di misura
	przA		double(9,2)          prezzo base
*/
	public Articoli() {
		// TODO Auto-generated constructor stub
	}
  private int id;	
  private String codA;
  private String desA;
  private String umiA ;
  private double przA;
	/**
	 * @param args
	 */
  public double getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	public String getCodA() {
		return codA;
	}
	public void setCodA(String codA) {
		this.codA = codA;
	}
	public String getDesA() {
		return desA;
	}
	public void setDesA(String desA) {
		this.desA = desA;
	}
	public String getUmiA() {
		return umiA;
	}
	public void setUmiA(String umiA) {
		this.umiA = umiA;
	}
	public double getPrzA() {
		return przA;
	}
	public void setPrzA(double przA) {
		this.przA = przA;
	}

}
