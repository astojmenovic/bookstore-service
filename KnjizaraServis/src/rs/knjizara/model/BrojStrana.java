/**
 * 
 */
package rs.knjizara.model;

/**
 * Predstavlja broj strana neke knjige
 * 
 * @author astojmenovic
 *
 */
public class BrojStrana {
	
	/**
	 * Predstavlja broj strana knjige
	 */
	private int brojStrana;

	/**
	 * @param brojStrana saljemo broj strana knjige
	 */
	public BrojStrana(int brojStrana) {
		super();
		this.brojStrana = brojStrana;
	}

	/**
	 * @return the brojStrana
	 */
	public int getBrojStrana() {
		return brojStrana;
	}

	/**
	 * @param brojStrana
	 *            the brojStrana to set
	 */
	public void setBrojStrana(int brojStrana) {
		this.brojStrana = brojStrana;
	}

}
