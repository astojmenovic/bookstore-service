/**
 * 
 */
package rs.knjizara.model;

/**
 * Predstavlja ISBN oznaku knjige
 * 
 * @author astojmenovic
 *
 */
public class ISBN {
	
	/**
	 * Prefiks
	 */
	private String prefiks;
	/**
	 * Grupa
	 */
	private String grupa;
	/**
	 * Izdavac
	 */
	private String izdavac;
	/**
	 * Naslov
	 */
	private String naslov;
	/**
	 * Kontrolni broj
	 */
	private String kontrolniBroj;
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ISBN " + prefiks + " - " + grupa + " - " + izdavac + " - " + naslov
				+ " - " + kontrolniBroj;
	}
	/**
	 * @param prefiks saljemo prefiks
	 * @param grupa saljemo grupu
	 * @param izdavac saljemo izdavaca
	 * @param naslov saljemo naslov
	 * @param kontrolniBroj saljemo kontrolni broj
	 */
	public ISBN(String prefiks, String grupa, String izdavac, String naslov, String kontrolniBroj) {
		super();
		this.prefiks = prefiks;
		this.grupa = grupa;
		this.izdavac = izdavac;
		this.naslov = naslov;
		this.kontrolniBroj = kontrolniBroj;
	}
	/**
	 * @return the prefiks
	 */
	public String getPrefiks() {
		return prefiks;
	}
	/**
	 * @param prefiks the prefiks to set
	 */
	public void setPrefiks(String prefiks) {
		this.prefiks = prefiks;
	}
	/**
	 * @return the grupa
	 */
	public String getGrupa() {
		return grupa;
	}
	/**
	 * @param grupa the grupa to set
	 */
	public void setGrupa(String grupa) {
		this.grupa = grupa;
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
	/**
	 * @return the kontrolniBroj
	 */
	public String getKontrolniBroj() {
		return kontrolniBroj;
	}
	/**
	 * @param kontrolniBroj the kontrolniBroj to set
	 */
	public void setKontrolniBroj(String kontrolniBroj) {
		this.kontrolniBroj = kontrolniBroj;
	}
	
}
