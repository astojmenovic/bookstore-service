/**
 * 
 */
package rs.knjizara.model;

/**
 * 
 * Predstavlja broj izdanja knjige
 * @author astojmenovic
 *
 */
public class BrojIzdanja {
	
	/**
	 * Predstavlja redni broj izdanja knjige
	 */
	private int brojIzdanja;

	/**
	 * @param brojIzdanja saljemo broj izdanja knjige
	 */
	public BrojIzdanja(int brojIzdanja) {
		this.brojIzdanja = brojIzdanja;
	}

	/**
	 * @return the brojIzdanja
	 */
	public int getBrojIzdanja() {
		return brojIzdanja;
	}

	/**
	 * @param brojIzdanja the brojIzdanja to set
	 */
	public void setBrojIzdanja(int brojIzdanja) {
		this.brojIzdanja = brojIzdanja;
	}
	
	
	
}
