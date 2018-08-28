/**
 * 
 */
package rs.knjizara.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Predstavlja jednu knjigu sa listom autora, listom izdavaca, naslovom knjige,
 * brojem strana, cenom, formatom, godinom izdanja, ISBN-om, jezikom kojim je
 * napisana kniga, kojoj oblasti pripada knjiga, koji povez ima.
 * 
 * @author astojmenovic
 *
 */
public class Knjiga {

	/**
	 * Redni broj knjige
	 */
	private IDKnjige id;
	/**
	 * Naslov knjige
	 */
	private Naslov naslov;
	/**
	 * Autori knjige
	 */
	private List<Autor> autori;
	/**
	 * Izdavaci knjige
	 */
	private List<Izdavac> izdavaci;
	/**
	 * Mesto izdanja
	 */
	private Mesto mesto;
	/**
	 * Godina izdanja
	 */
	private Godina godina;
	/**
	 * Redni broj izdanja
	 */
	private BrojIzdanja brojIzdanja;
	/**
	 * Jezik
	 */
	private Jezik jezik;
	/**
	 * Oblast
	 */
	private Oblast oblast;
	/**
	 * Povez
	 */
	private Povez povez;
	/**
	 * ISBN
	 */
	private ISBN isbn;
	/**
	 * Broj strana knjige
	 */
	private BrojStrana brojStrana;
	/**
	 * Format knjige
	 */
	private Format format;
	/**
	 * Cena knjige
	 */
	private Cena cena;

	/**
	 * @return the autori
	 */
	public List<Autor> getAutori() {
		return autori;
	}

	/**
	 * @return the izdavaci
	 */
	public List<Izdavac> getIzdavaci() {
		return izdavaci;
	}

	/**
	 * @param id saljemo redni broj knjige
	 * @param naslov saljemo naslov knjige
	 * @param autori saljemo imena i prezimena autora
	 * @param izdavaci saljemo nazive izdavaca
	 * @param mesto saljemo mesto izdanja
	 * @param godina saljemo godinu izdanja
	 * @param brojIzdanja saljemo redni broj izdanja
	 * @param jezik saljemo jezik
	 * @param oblast saljemo oblast
	 * @param povez saljemo povez
	 * @param isbn saljemo ISBN
	 * @param brojStrana saljemo broj strana
	 * @param format saljemo format
	 * @param cena saljemo cenu
	 */

	public Knjiga(IDKnjige id, Naslov naslov, List<Autor> autori, List<Izdavac> izdavaci, Mesto mesto, Godina godina,
			BrojIzdanja brojIzdanja, Jezik jezik, Oblast oblast, Povez povez, ISBN isbn, BrojStrana brojStrana,
			Format format, Cena cena) {
		super();
		this.id = id;
		this.naslov = naslov;
		this.autori = autori;
		this.izdavaci = izdavaci;
		this.mesto = mesto;
		this.godina = godina;
		this.brojIzdanja = brojIzdanja;
		this.jezik = jezik;
		this.oblast = oblast;
		this.povez = povez;
		this.isbn = isbn;
		this.brojStrana = brojStrana;
		this.format = format;
		this.cena = cena;
	}

	/**
	 * @return the mesto
	 */
	public Mesto getMesto() {
		return mesto;
	}

	/**
	 * @return the id
	 */
	public IDKnjige getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(IDKnjige id) {
		this.id = id;
	}

	/**
	 * @param mesto
	 *            the mesto to set
	 */
	public void setMesto(Mesto mesto) {
		this.mesto = mesto;
	}

	/**
	 * @return the brojIzdanja
	 */
	public BrojIzdanja getBrojIzdanja() {
		return brojIzdanja;
	}

	/**
	 * @param brojIzdanja
	 *            the brojIzdanja to set
	 */
	public void setBrojIzdanja(BrojIzdanja brojIzdanja) {
		this.brojIzdanja = brojIzdanja;
	}

	/**
	 * @param izdavaci
	 *            the izdavaci to set
	 */
	public void setIzdavaci(List<Izdavac> izdavaci) {
		this.izdavaci = izdavaci;
	}

	/**
	 * @param autori
	 *            the autori to set
	 */
	public void setAutori(List<Autor> autori) {
		this.autori = autori;
	}

	/**
	 * @return the naslov
	 */
	public Naslov getNaslov() {
		return naslov;
	}

	/**
	 * @param naslov
	 *            the naslov to set
	 */
	public void setNaslov(Naslov naslov) {
		this.naslov = naslov;
	}

	/**
	 * @return the brojStrana
	 */
	public BrojStrana getBrojStrana() {
		return brojStrana;
	}

	/**
	 * @param brojStrana
	 *            the brojStrana to set
	 */
	public void setBrojStrana(BrojStrana brojStrana) {
		this.brojStrana = brojStrana;
	}

	/**
	 * @return the cena
	 */
	public Cena getCena() {
		return cena;
	}

	/**
	 * @param cena
	 *            the cena to set
	 */
	public void setCena(Cena cena) {
		this.cena = cena;
	}

	/**
	 * @return the format
	 */
	public Format getFormat() {
		return format;
	}

	/**
	 * @param format
	 *            the format to set
	 */
	public void setFormat(Format format) {
		this.format = format;
	}

	/**
	 * @return the godina
	 */
	public Godina getGodina() {
		return godina;
	}

	/**
	 * @param godina
	 *            the godina to set
	 */
	public void setGodina(Godina godina) {
		this.godina = godina;
	}

	/**
	 * @return the isbn
	 */
	public ISBN getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn
	 *            the isbn to set
	 */
	public void setIsbn(ISBN isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the jezik
	 */
	public Jezik getJezik() {
		return jezik;
	}

	/**
	 * @param jezik
	 *            the jezik to set
	 */
	public void setJezik(Jezik jezik) {
		this.jezik = jezik;
	}

	/**
	 * @return the oblast
	 */
	public Oblast getOblast() {
		return oblast;
	}

	/**
	 * @param oblast
	 *            the oblast to set
	 */
	public void setOblast(Oblast oblast) {
		this.oblast = oblast;
	}

	/**
	 * @return the povez
	 */
	public Povez getPovez() {
		return povez;
	}

	/**
	 * @param povez
	 *            the povez to set
	 */
	public void setPovez(Povez povez) {
		this.povez = povez;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Knjiga [id=" + id + ", naslov=" + naslov + ", autori=" + autori + ", izdavaci=" + izdavaci + ", mesto="
				+ mesto + ", godina=" + godina + ", brojIzdanja=" + brojIzdanja + ", jezik=" + jezik + ", oblast="
				+ oblast + ", povez=" + povez + ", isbn=" + isbn + ", brojStrana=" + brojStrana + ", format=" + format
				+ ", cena=" + cena + "]";
	}

	/**
	 * @param arg0
	 * @return
	 * @see java.util.List#add(java.lang.Object)
	 */
	public boolean add(Autor arg0) {
		if (autori == null) {
			autori = new ArrayList<Autor>();
		}
		return autori.add(arg0);
	}

	/**
	 * @param e
	 * @return
	 * @see java.util.List#add(java.lang.Object)
	 */
	public boolean add(Izdavac e) {
		if (izdavaci == null) {
			izdavaci = new ArrayList<Izdavac>();
		}
		return izdavaci.add(e);
	}

}
