/**
 * 
 */
package rs.knjizara.importer;

import rs.knjizara.exception.NijeDobarTipSpisakKnjigaException;

/**
 * Predstavlja kreiranje implementacije importera odredjenog tipa fajla
 * @author astojmenovic
 *
 */
public class SpisakKnjigaImporterFactory {
	
	/**
	 * Pravimo Excel Importer tipa KNJIGE_EXCEL
	 * @author astojmenovic
	 * @param tip saljemo tip fajla
	 * 
	 * @return Objekat tipa SpisakKnjigaEXCELImporter
	 */
	public SpisakKnjigaEXCELImporter napraviEXCELImporter(SpisakKnjigaEXCELType tip) throws NijeDobarTipSpisakKnjigaException{
		
		if(tip == SpisakKnjigaEXCELType.KNJIGE_EXCEL){
			return new SpisakKnjigaEXCELImplementation();
		}else{
			throw new NijeDobarTipSpisakKnjigaException("Nije dobar tip");
		}
		
	}
	
}
