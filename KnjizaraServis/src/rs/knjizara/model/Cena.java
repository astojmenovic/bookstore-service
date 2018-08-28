/**
 * 
 */
package rs.knjizara.model;

/**
 * 
 * Predstavlja cenu neke knjige
 * @author astojmenovic
 *
 */
public class Cena {
	
	/**
	 * Cena knjige
	 */
	private int cena;
	
	/**
	 * @param cena saljemo cenu
	 */
	public Cena(int cena) {
		super();
		this.cena = cena;
	}

	/**
	 * @return the cena
	 */
	public int getCena() {
		return cena;
	}

	/**
	 * @param cena the cena to set
	 */
	public void setCena(int cena) {
		this.cena = cena;
	}
	
}
