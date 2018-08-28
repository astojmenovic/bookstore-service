/**
 * 
 */
package rs.knjizara.importer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import rs.knjizara.model.Autor;
import rs.knjizara.model.BrojIzdanja;
import rs.knjizara.model.BrojStrana;
import rs.knjizara.model.Cena;
import rs.knjizara.model.Format;
import rs.knjizara.model.Godina;
import rs.knjizara.model.IDKnjige;
import rs.knjizara.model.ISBN;
import rs.knjizara.model.Izdavac;
import rs.knjizara.model.Jezik;
import rs.knjizara.model.Knjiga;
import rs.knjizara.model.Mesto;
import rs.knjizara.model.Naslov;
import rs.knjizara.model.Oblast;
import rs.knjizara.model.Povez;
import rs.knjizara.model.SpisakKnjiga;

/**
 * Predstavlja implementaciju metoda za importovanje excel fajla
 * @author astojmenovic
 *
 */
public class SpisakKnjigaEXCELImplementation implements SpisakKnjigaEXCELImporter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * rs.knjizara.importer.SpisakKnjigaEXCELImporter#importFromEXCELFile(java.
	 * lang.String)
	 */
	/**
	 * Citamo podatke iz excela i pravimo objekat SpisakKnjiga
	 * @author astojmenovic
	 *	@param fajl putanja do fajla
	 * @param preskociPrvuLiniju da li se preskace prva linija u fajlu
	 * @return Vraca spisak knjiga
	 */
	@Override
	public SpisakKnjiga importFromEXCELFile(String fajl, Boolean preskociPrvuLiniju) throws IOException {
		FileInputStream file = new FileInputStream(new File(fajl));

		// Pravi workbook instance .xlsx fajla
		XSSFWorkbook wb = new XSSFWorkbook(file);

		// Pravi sheet object da vrati sheet
		XSSFSheet sheet = wb.getSheetAt(0);

		Iterator<Row> rowIterator = sheet.iterator();

		if(preskociPrvuLiniju == true){
			rowIterator.next();
		}
		
		List<Knjiga> knjige = new ArrayList<>();

		// Traversing over each row of XLSX file
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			// For each row, iterate through each columns
			Knjiga knjiga = konvertujemoRedIzEXCELFajla(row);

			knjige.add(knjiga);
			
		}
		

		return new SpisakKnjiga(knjige, null);
	}
	/**
	 * Konvertujemo red iz excel fajla i objekat Knjiga
	 * @author astojmenovic
	 *@param knjiga red iz spiska
	 *@return Vraca objekat Knjiga
	 */
	private Knjiga konvertujemoRedIzEXCELFajla(Row knjiga) {
		Iterator<Cell> cellIterator = knjiga.cellIterator();
		int i = 1;
		IDKnjige id = null;
		Naslov naslov = null;
		List<Autor> autori = new ArrayList<Autor>();
		List<Izdavac> izdavaci = new ArrayList<Izdavac>();
		Mesto mesto = null;
		Godina godina = null;
		BrojIzdanja brojIzdanja = null;
		Jezik jezik = null;
		Oblast oblast = null;
		Povez povez = null;
		ISBN isbn = null;
		BrojStrana brojStrana = null;
		Format format = null;
		Cena cena = null;
		while (cellIterator.hasNext()) {
			Cell cell = cellIterator.next();

			if (i == 1) {
				id = new IDKnjige((int) cell.getNumericCellValue());
			} else if (i == 2) {
				naslov = new Naslov(cell.getStringCellValue());
			} else if (i == 3) {

				if (cell.getStringCellValue().contains(",")) {
					String[] listaAutora = cell.getStringCellValue().split(",");

					for (int j = 0; j < listaAutora.length; j++) {
						Autor autor = new Autor(listaAutora[j]);
						autori.add(autor);
					}
				} else {
					Autor autor = new Autor(cell.getStringCellValue());
					autori.add(autor);
				}
			} else if (i == 4) {

				if (cell.getStringCellValue().contains(",")) {
					String[] listaIzdavaca = cell.getStringCellValue().split(",");

					for (int j = 0; j < listaIzdavaca.length; j++) {
						Izdavac izdavac = new Izdavac(listaIzdavaca[j]);
						izdavaci.add(izdavac);
					}
				} else {
					Izdavac izdavac = new Izdavac(cell.getStringCellValue());
					izdavaci.add(izdavac);
				}
			} else if (i == 5) {
				mesto = new Mesto(cell.getStringCellValue());
			} else if (i == 6) {
				godina = new Godina((int) cell.getNumericCellValue());
			} else if (i == 7) {
				brojIzdanja = new BrojIzdanja((int) cell.getNumericCellValue());
			} else if (i == 8) {
				
				if (cell.getStringCellValue().equals("Srpski")) {
					jezik = Jezik.SRPSKI;
				} else if (cell.getStringCellValue().equals("Engleski")) {
					jezik = Jezik.ENGLESKI;
				} else if (cell.getStringCellValue().equals("Nemacki")) {
					jezik = Jezik.NEMACKI;
				} else if (cell.getStringCellValue().equals("Ruski")) {
					jezik = Jezik.RUSKI;
				} else if (cell.getStringCellValue().equals("Spanski")) {
					jezik = Jezik.SPANSKI;
				} else if (cell.getStringCellValue().equals("Arapski")) {
					jezik = Jezik.ARAPSKI;
				} else if (cell.getStringCellValue().equals("Kineski")) {
					jezik = Jezik.KINESKI;
				} else if (cell.getStringCellValue().equals("Svedski")) {
					jezik = Jezik.SVEDSKI;
				} else if (cell.getStringCellValue().equals("Francuski")) {
					jezik = Jezik.FRANCUSKI;
				}
			} else if (i == 9) {
				
				if (cell.getStringCellValue().equals("Akcija")) {
					oblast = Oblast.AKCIJA;
				} else if (cell.getStringCellValue().equals("Autobiografija")) {
					oblast = Oblast.AUTOBIOGRAFIJA;
				} else if (cell.getStringCellValue().equals("Avantura")) {
					oblast = Oblast.AVANTURA;
				} else if (cell.getStringCellValue().equals("Biografija")) {
					oblast = Oblast.BIOGRAFIJA;
				} else if (cell.getStringCellValue().equals("Decje knjige")) {
					oblast = Oblast.DECJE_KNJIGE;
				} else if (cell.getStringCellValue().equals("Drama")) {
					oblast = Oblast.DRAMA;
				} else if (cell.getStringCellValue().equals("Edukativni")) {
					oblast = Oblast.EDUKATIVNI;
				} else if (cell.getStringCellValue().equals("Enciklopedija")) {
					oblast = Oblast.ENCIKLOPEDIJA;
				} else if (cell.getStringCellValue().equals("Epska fantastika")) {
					oblast = Oblast.EPSKA_FANTASTIKA;
				} else if (cell.getStringCellValue().equals("Epska poezija")) {
					oblast = Oblast.EPSKA_POEZIJA;
				} else if (cell.getStringCellValue().equals("Istorijski roman")) {
					oblast = Oblast.ISTORIJSKI_ROMAN;
				} else if (cell.getStringCellValue().equals("Lirska poezija")) {
					oblast = Oblast.LIRSKA_POEZIJA;
				} else if (cell.getStringCellValue().equals("Ljubavni roman")) {
					oblast = Oblast.LJUBAVNI_ROMAN;
				} else if (cell.getStringCellValue().equals("Memoari")) {
					oblast = Oblast.MEMOARI;
				} else if (cell.getStringCellValue().equals("Naucna fantastika")) {
					oblast = Oblast.NAUCNA_FANTASTIKA;
				} else if (cell.getStringCellValue().equals("Politicki roman")) {
					oblast = Oblast.POLITICKI_ROMAN;
				} else if (cell.getStringCellValue().equals("Pripovetke")) {
					oblast = Oblast.PRIPOVETKE;
				} else if (cell.getStringCellValue().equals("Psiholoski roman")) {
					oblast = Oblast.PSIHOLOSKI_ROMAN;
				} else if (cell.getStringCellValue().equals("Putopisi")) {
					oblast = Oblast.PUTOPISI;
				} else if (cell.getStringCellValue().equals("Romanticna komedija")) {
					oblast = Oblast.ROMANTICNA_KOMEDIJA;
				} else if (cell.getStringCellValue().equals("Satiricni roman")) {
					oblast = Oblast.SATIRICNI_ROMAN;
				} else if (cell.getStringCellValue().equals("Filozofija")) {
					oblast = Oblast.FILOZOFIJA;
				} else if (cell.getStringCellValue().equals("Horor")) {
					oblast = Oblast.HOROR;
				} else if (cell.getStringCellValue().equals("Istorija")) {
					oblast = Oblast.ISTORIJA;
				} else if (cell.getStringCellValue().equals("Klasici")) {
					oblast = Oblast.KLASICI;
				} else if (cell.getStringCellValue().equals("Komedija")) {
					oblast = Oblast.KOMEDIJA;
				} else if (cell.getStringCellValue().equals("Tinejdz roman")) {
					oblast = Oblast.TINEJDZ_ROMAN;
				} else if (cell.getStringCellValue().equals("Triler")) {
					oblast = Oblast.TRILER;
				} else if (cell.getStringCellValue().equals("Misterija")) {
					oblast = Oblast.MISTERIJA;
				} else if (cell.getStringCellValue().equals("Roman")) {
					oblast = Oblast.ROMAN;
				}else if (cell.getStringCellValue().equals("Beletristika")) {
					oblast = Oblast.BELETRISTIKA;
				}
			} else if (i == 10) {
				
				if (cell.getStringCellValue().equals("Tvrdi")) {
					povez = Povez.TVRDI;
				} else if (cell.getStringCellValue().equals("Brosirani")) {
					povez = Povez.BROSIRANI;
				}
			} else if (i == 11) {
				String[] isbnDelovi = cell.getStringCellValue().split("-");
				String prefiks = isbnDelovi[0];
				String grupa = isbnDelovi[1];
				String izdavac = isbnDelovi[2];
				String naslov1 = isbnDelovi[3];
				String broj = isbnDelovi[4];

				isbn = new ISBN(prefiks, grupa, izdavac, naslov1, broj);
			} else if (i == 12) {
				brojStrana = new BrojStrana((int) cell.getNumericCellValue());
			} else if (i == 13) {
				String[] formatDelovi = cell.getStringCellValue().split("x");

				int duzina = Integer.parseInt(formatDelovi[0]);
				int sirina = Integer.parseInt(formatDelovi[1]);

				format = new Format(duzina, sirina);
			} else if (i == 14) {
				cena = new Cena((int) cell.getNumericCellValue());
			}
			i++;
		}

		return new Knjiga(id, naslov, autori, izdavaci, mesto, godina, brojIzdanja, jezik, oblast, povez, isbn,
				brojStrana, format, cena);

	}
}
