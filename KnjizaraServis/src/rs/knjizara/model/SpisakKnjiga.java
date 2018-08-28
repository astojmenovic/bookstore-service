/**
 * 
 */
package rs.knjizara.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Predstavlja listu knjiga sa svim njenim podacima
 * 
 * @author astojmenovic
 *
 */
public class SpisakKnjiga {
	
	/**
	 * Lista knjiga
	 */
	private List<Knjiga> knjige;
	/**
	 * Datum modifikacije
	 */
	private Date modifikacija;
	
	
	
	/**
	 * @param knjige saljemo knjige
	 * @param modifikacija saljemo datum modifikacije
	 */
	public SpisakKnjiga(List<Knjiga> knjige, Date modifikacija) {
		this.knjige = knjige;
		this.modifikacija = modifikacija;
	}
	/**
	 * @return the knjige
	 */
	public List<Knjiga> getKnjige() {
		return knjige;
	}
	/**
	 * @param knjige the knjige to set
	 */
	public void setKnjige(List<Knjiga> knjige) {
		this.knjige = knjige;
	}
	/**
	 * @return the modifikacija
	 */
	public Date getModifikacija() {
		return modifikacija;
	}
	/**
	 * @param modifikacija the modifikacija to set
	 */
	public void setModifikacija(Date modifikacija) {
		this.modifikacija = modifikacija;
	}
	/**
	 * @param e
	 * @return
	 * @see java.util.List#add(java.lang.Object)
	 */
	public boolean add(Knjiga e) {
		if(knjige == null){
			knjige = new ArrayList<Knjiga>();
		}
		return knjige.add(e);
	}
	
	
	
}
