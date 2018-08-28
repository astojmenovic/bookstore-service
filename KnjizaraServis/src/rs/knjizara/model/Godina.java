/**
 * 
 */
package rs.knjizara.model;

/**
 * Predstavlja godinu izdanja knjige
 * @author astojmenovic
 *
 */
public class Godina {
	
	/**
	 * Godina izdanja
	 */
	private int godina;

	/**
	 * @param godina saljemo godinu izdanja
	 */
	public Godina(int godina) {
		super();
		this.godina = godina;
	}

	/**
	 * @return the godina
	 */
	public int getGodina() {
		return godina;
	}

	/**
	 * @param godina
	 *            the godina to set
	 */
	public void setGodina(int godina) {
		this.godina = godina;
	}

}
