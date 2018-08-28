/**
 * 
 */
package testKnjizaraServis;

import java.io.IOException;

import rs.knjizara.exception.NijeDobarTipSpisakKnjigaException;
import rs.knjizara.importer.SpisakKnjigaEXCELImporter;
import rs.knjizara.importer.SpisakKnjigaEXCELType;
import rs.knjizara.importer.SpisakKnjigaImporterFactory;
import rs.knjizara.model.Jezik;
import rs.knjizara.model.Korpa;
import rs.knjizara.model.SpisakKnjiga;
import rs.knjizara.spisakknjigaqueries.SpisakKnjigeQueries;

/**
 * @author astojmenovic
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpisakKnjigaImporterFactory factory = new SpisakKnjigaImporterFactory();

		try {
			SpisakKnjigaEXCELImporter importer = factory.napraviEXCELImporter(SpisakKnjigaEXCELType.KNJIGE_EXCEL);
			SpisakKnjiga sk = importer.importFromEXCELFile("Knjige.xlsx", true);
			SpisakKnjigeQueries skq = new SpisakKnjigeQueries(sk);
			Korpa korpa = new Korpa();

			System.out.println("Narudzbina:\n");

			skq.dodajUKorpu(sk, korpa, "Koreni");
			skq.dodajUKorpu(sk, korpa, "Bosanski rat");
			skq.narudzbina(sk, korpa);

			System.out.println("\nIspis svih knjiga\n");

			skq.ispisSpiskaKnjiga(sk);

			System.out.println("\nIspis svih knjiga izmedju 1960 i 1970\n");

			skq.ispisKnjigaIzmedjuGodinaIzdanja(sk, 1960, 1970);

			System.out.println("\nIspis knjiga po autoru: Dobrica Cosic\n");

			skq.ispisKnjigaPoAutoru(sk, "Dobrica Cosic");

			System.out.println("\nIspis knjiga po mestu izdanja: Beograd\n");

			skq.ispisKnjigaPoMestuIzdanja(sk, "Beograd");

			System.out.println("\nIspis knjiga po izdavacu: Prosveta Beograd\n");

			skq.ispisKnjigaPoIzdavacu(sk, "Prosveta Beograd");

			System.out.println("\nIspis knjiga po godini: 1963\n");

			skq.ispisKnjigaPoGodini(sk, 1963);

			System.out.println("\nIspis knjiga po jeziku: Srpski\n");

			skq.ispisKnjigaPoJeziku(sk, Jezik.SRPSKI);

		} catch (NijeDobarTipSpisakKnjigaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
