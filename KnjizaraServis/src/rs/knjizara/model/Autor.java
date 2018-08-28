/**
 * 
 */
package rs.knjizara.model;

/**
 * Predstavlja autora neke knjige
 * @author astojmenovic
 *
 */
public class Autor {
	
	/**
	 * Ime i prezime autora
	 */
	private String imePrezime;

	/**
	 * @param imePrezime saljemo ime i prezime autora
	 */
	public Autor(String imePrezime) {
		super();
		this.imePrezime = imePrezime;
	}

	/**
	 * @return the imePrezime
	 */
	public String getImePrezime() {
		return imePrezime;
	}

	/**
	 * @param imePrezime the imePrezime to set
	 */
	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((imePrezime == null) ? 0 : imePrezime.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		if (imePrezime == null) {
			if (other.imePrezime != null)
				return false;
		} else if (!imePrezime.equals(other.imePrezime))
			return false;
		return true;
	}
	
	
}
