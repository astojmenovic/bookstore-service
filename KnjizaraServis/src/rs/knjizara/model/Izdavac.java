/**
 * 
 */
package rs.knjizara.model;

/**
 * Predstavlja izdavaca neke knjige
 * 
 * @author astojmenovic
 *
 */
public class Izdavac {
	
	/**
	 * Naziv izdavaca
	 */
	private String izdavac;
	
	

	/**
	 * @param izdavac saljemo naziv izdavaca
	 */
	public Izdavac(String izdavac) {
		super();
		this.izdavac = izdavac;
	}

	/**
	 * @return the izdavac
	 */
	public String getIzdavac() {
		return izdavac;
	}

	/**
	 * @param izdavac the izdavac to set
	 */
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	
	
	
}
