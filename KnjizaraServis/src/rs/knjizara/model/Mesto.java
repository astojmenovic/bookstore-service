/**
 * 
 */
package rs.knjizara.model;

/**
 * 
 * Predstavlja mesto izdanja knjige
 * @author astojmenovic
 *
 */
public class Mesto {
	
	/**
	 * Naziv mesta
	 */
	private String mesto;
	/**
	 * @param mesto saljemo mesto
	 */
	public Mesto(String mesto) {
		
		this.mesto = mesto;
	}
	/**
	 * @return the mesto
	 */
	public String getMesto() {
		return mesto;
	}
	/**
	 * @param mesto the mesto to set
	 */
	public void setMesto(String mesto) {
		this.mesto = mesto;
	}
	
	
	
}
