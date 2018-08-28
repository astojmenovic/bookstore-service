/**
 * 
 */
package rs.knjizara.model;

/**
 * Predstavlja naslov knjige
 * 
 * @author astojmenovic
 *
 */
public class Naslov {
	
	/**
	 * Naslov knjige
	 */
	private String naslov;

	
	/**
	 * @param naslov saljemo naslov
	 */
	public Naslov(String naslov) {
		super();
		this.naslov = naslov;
	}

	/**
	 * @return the naslov
	 */
	public String getNaslov() {
		return naslov;
	}

	/**
	 * @param naslov the naslov to set
	 */
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	
	
	
}
