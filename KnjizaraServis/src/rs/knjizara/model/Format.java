/**
 * 
 */
package rs.knjizara.model;

/**
 * Predstavlja format knjige
 * 
 * @author astojmenovic
 *
 */
public class Format {
	
	/**
	 * Duzina knjige
	 */
	private int duzina;
	/**
	 * Sirina knjige
	 */
	private int sirina;
	
	

	/**
	 * @param duzina saljemo duzinu knjige
	 * @param sirina saljemo sirinu knjige
	 */
	public Format(int duzina, int sirina) {
		super();
		this.duzina = duzina;
		this.sirina = sirina;
	}

	/**
	 * @return the duzina
	 */
	public int getDuzina() {
		return duzina;
	}

	/**
	 * @param duzina
	 *            the duzina to set
	 */
	public void setDuzina(int duzina) {
		this.duzina = duzina;
	}

	/**
	 * @return the sirina
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * @param sirina
	 *            the sirina to set
	 */
	public void setSirina(int sirina) {
		this.sirina = sirina;
	}

}
