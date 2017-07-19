package com.collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ordini")

public class Ordini {
	public Ordini(){
	}
	/*
	 * Ordini
numO  int(4)                         numero ordine
rigO  int(3)                           numero riga ordine
codO		varchar(6)   codice cliente
artO		varchar(15)         codice articolo
qtaO		double(7,2)    quantita
przO		double(9,2)      prezzo
scoO		double(5,2)   sconto
totO          double(11,2)        valore totale riga
	 */
	//@Column(name="numO")
	private int id;
	private int numO;
	private int rigO ;
	private String codO;
	private String artO;
	private double qtaO;
	private double przO;
	private double scoO;
	private double totO;
	public int getNumO() {
		return numO;
	}
	public void setNumO(int numO) {
		this.numO = numO;
	}
	public int getRigO() {
		return rigO;
	}
	public void setRigO(int rigO) {
		this.rigO = rigO;
	}
	public String getCodO() {
		return codO;
	}
	public void setCodO(String codO) {
		this.codO = codO;
	}
	public String getArtO() {
		return artO;
	}
	public void setArtO(String artO) {
		this.artO = artO;
	}
	public double getQtaO() {
		return qtaO;
	}
	public void setQtaO(double qtaO) {
		this.qtaO = qtaO;
	}
	public double getPrzO() {
		return przO;
	}
	public void setPrzO(double przO) {
		this.przO = przO;
	}
	public double getScoO() {
		return scoO;
	}
	public void setScoO(double scoO) {
		this.scoO = scoO;
	}
	public double getTotO() {
		return totO;
	}
	public void setTotO(double totO) {
		this.totO = totO;
	}
	public double getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	
}
