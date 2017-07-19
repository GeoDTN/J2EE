package com.collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public class Listino {
/* Listino
codL		varchar(6)             codice cliente
artL		varchar(15)         codice articolo
przL		double(9,2)     prezzo listino
scoL		double(5,2)      sconto listino

 */
	private int id;
	private String codL;
	private String artL;
	private double przL;
	private double scoL;
	public Listino() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String getCodL() {
		return codL;
	}
	public void setCodL(String codL) {
		this.codL = codL;
	}
	public String getArtL() {
		return artL;
	}
	public void setArtL(String artL) {
		this.artL = artL;
	}
	public double getPrzL() {
		return przL;
	}
	public void setPrzL(double przL) {
		this.przL = przL;
	}
	public double getScoL() {
		return scoL;
	}
	public void setScoL(double scoL) {
		this.scoL = scoL;
	}
	public double getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}

}
