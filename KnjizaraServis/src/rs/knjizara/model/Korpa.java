/**
 * 
 */
package rs.knjizara.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Predstavlja spisak knjiga za kupovinu
 * @author astojmenovic
 *
 */
public class Korpa {
	
	/**
	 * Lista knjiga u korpi
	 */
	private List<Knjiga> knjige;

	/**
	 * @param knjige saljemo knjige
	 */
	public Korpa(List<Knjiga> knjige) {
		this.knjige = knjige;
	}

	public Korpa() {
		// TODO Auto-generated constructor stub
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
