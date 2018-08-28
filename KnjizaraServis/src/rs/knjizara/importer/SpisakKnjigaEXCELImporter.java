/**
 * 
 */
package rs.knjizara.importer;

import java.io.IOException;

import rs.knjizara.model.SpisakKnjiga;

/**
 * Interfejs excel importera
 * @author astojmenovic
 *
 */
public interface SpisakKnjigaEXCELImporter {
	
	/**
	 * @param fajl saljemo putanju do fajla
	 * @param preskociprvuLiniju saljemo da li hocemo da preskocimo prvu liniju iz fajla
	 * @return
	 * @throws IOException
	 */
	public SpisakKnjiga importFromEXCELFile(String fajl, Boolean preskociprvuLiniju) throws IOException;
	
}
