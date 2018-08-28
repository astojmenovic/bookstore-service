/**
 * 
 */
package rs.knjizara.model;

/**
 * Predstavlja redni broj knjige
 * @author astojmenovic
 *
 */
public class IDKnjige {
	
	/**
	 * Redni broj knjige
	 */
	private int id;

	/**
	 * @param id saljemo redni broj knjige
	 */
	public IDKnjige(int id) {
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
