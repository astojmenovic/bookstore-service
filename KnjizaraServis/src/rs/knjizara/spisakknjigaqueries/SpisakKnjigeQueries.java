/**
 * 
 */
package rs.knjizara.spisakknjigaqueries;

import rs.knjizara.model.Jezik;
import rs.knjizara.model.Knjiga;
import rs.knjizara.model.Korpa;
import rs.knjizara.model.SpisakKnjiga;

/**
 * Queries za spisak knjiga
 * 
 * @author astojmenovic
 *
 */

public class SpisakKnjigeQueries {

	/**
	 * Spisak knjiga
	 */
	private SpisakKnjiga spisakKnjiga;

	/**
	 * @param spisakKnjiga saljemo spisak knjiga
	 */
	public SpisakKnjigeQueries(SpisakKnjiga spisakKnjiga) {
		this.spisakKnjiga = spisakKnjiga;
	}

	/**
	 * Ispisujemo sve knjige
	 * 
	 * @param spisakKnjiga saljemo spisak knjiga
	 * 
	 */
	public void ispisSpiskaKnjiga(SpisakKnjiga spisakKnjiga) {

		for (Knjiga knjiga : spisakKnjiga.getKnjige()) {
			System.out.print(knjiga.getId().getId() + "\t");
			System.out.print(knjiga.getNaslov().getNaslov() + "\t");

			for (int i = 0; i < knjiga.getAutori().size(); i++) {
				System.out.print(knjiga.getAutori().get(i).getImePrezime() + ",\t");
			}

			for (int j = 0; j < knjiga.getIzdavaci().size(); j++) {
				System.out.print(knjiga.getIzdavaci().get(j).getIzdavac() + ", ");
			}
			System.out.print("\t");

			System.out.print(knjiga.getMesto().getMesto() + "\t");
			System.out.print(knjiga.getGodina().getGodina() + "\t");
			System.out.print(knjiga.getBrojIzdanja().getBrojIzdanja() + "\t");
			System.out.print(knjiga.getJezik() + "\t");
			System.out.print(knjiga.getOblast() + "\t");
			System.out.print(knjiga.getPovez() + "\t");
			System.out.print(knjiga.getIsbn().getPrefiks() + "-" + knjiga.getIsbn().getGrupa() + "-"
					+ knjiga.getIsbn().getIzdavac() + "-" + knjiga.getIsbn().getNaslov() + "-"
					+ knjiga.getIsbn().getKontrolniBroj() + "\t");
			System.out.print(knjiga.getBrojStrana().getBrojStrana() + "\t");
			System.out.print(knjiga.getFormat().getDuzina() + "x" + knjiga.getFormat().getSirina() + "\t");
			System.out.print(knjiga.getCena().getCena() + " RSD");

			System.out.println();

		}
	}

	/**
	 * 
	 * Ispisujemo jednu knjigu
	 * 
	 * @param knjiga saljemo knjigu
	 * 
	 */
	public void ispisKnjige(Knjiga knjiga) {

		System.out.print(knjiga.getId().getId() + "\t");
		System.out.print(knjiga.getNaslov().getNaslov() + "\t");

		for (int i = 0; i < knjiga.getAutori().size(); i++) {
			System.out.print(knjiga.getAutori().get(i).getImePrezime() + ",\t");
		}

		for (int j = 0; j < knjiga.getIzdavaci().size(); j++) {
			System.out.print(knjiga.getIzdavaci().get(j).getIzdavac() + ", ");
		}
		System.out.print("\t");

		System.out.print(knjiga.getMesto().getMesto() + "\t");
		System.out.print(knjiga.getGodina().getGodina() + "\t");
		System.out.print(knjiga.getBrojIzdanja().getBrojIzdanja() + "\t");
		System.out.print(knjiga.getJezik() + "\t");
		System.out.print(knjiga.getOblast() + "\t");
		System.out.print(knjiga.getPovez() + "\t");
		System.out.print(
				knjiga.getIsbn().getPrefiks() + "-" + knjiga.getIsbn().getGrupa() + "-" + knjiga.getIsbn().getIzdavac()
						+ "-" + knjiga.getIsbn().getNaslov() + "-" + knjiga.getIsbn().getKontrolniBroj() + "\t");
		System.out.print(knjiga.getBrojStrana().getBrojStrana() + "\t");
		System.out.print(knjiga.getFormat().getDuzina() + "x" + knjiga.getFormat().getSirina() + "\t");
		System.out.print(knjiga.getCena().getCena() + " RSD");

		System.out.println();

	}

	/**
	 * Ispisujemo sve knjige po autoru
	 * 
	 * @param spisakKnjiga saljemo spisak knjiga
	 * @param pisac saljemo pisca
	 * 
	 */
	public void ispisKnjigaPoAutoru(SpisakKnjiga spisakKnjiga, String pisac) {

		for (Knjiga knjiga : spisakKnjiga.getKnjige()) {

			for (int i = 0; i < knjiga.getAutori().size(); i++) {
				if (knjiga.getAutori().get(i).getImePrezime().equals(pisac)) {
					ispisKnjige(knjiga);
				}
			}

		}
	}

	/**
	 * Ispisujemo knjige po izdavacu
	 * 
	 * @param spisakKnjiga saljemo spisak knjiga
	 * @param izdavac saljemo izdavaca
	 * 
	 */
	public void ispisKnjigaPoIzdavacu(SpisakKnjiga spisakKnjiga, String izdavac) {

		for (Knjiga knjiga : spisakKnjiga.getKnjige()) {

			for (int i = 0; i < knjiga.getIzdavaci().size(); i++) {
				if (knjiga.getIzdavaci().get(i).getIzdavac().equals(izdavac)) {
					ispisKnjige(knjiga);
				}
			}

		}
	}

	/**
	 * Ispisujemo knjige po godini
	 * 
	 * @param spisakKnjiga saljemo spisak knjiga
	 * @param godina saljemo godinu
	 * 
	 */
	public void ispisKnjigaPoGodini(SpisakKnjiga spisakKnjiga, int godina) {

		for (Knjiga knjiga : spisakKnjiga.getKnjige()) {

			if (knjiga.getGodina().getGodina() == godina) {
				ispisKnjige(knjiga);
			}

		}
	}

	/**
	 * Ispisujemo knjige po mestu izdanja
	 * 
	 * @param spisakKnjiga saljemo spisak knjiga
	 * @param mesto saljemo mesto
	 * 
	 */
	public void ispisKnjigaPoMestuIzdanja(SpisakKnjiga spisakKnjiga, String mesto) {

		for (Knjiga knjiga : spisakKnjiga.getKnjige()) {

			if (knjiga.getMesto().getMesto().equals(mesto)) {
				ispisKnjige(knjiga);
			}

		}
	}

	/**
	 * Ispisujemo knjige po jeziku
	 * 
	 * @param spisakKnjiga saljemo spisak knjiga
	 * @param jezik saljemo jezik
	 * 
	 */
	public void ispisKnjigaPoJeziku(SpisakKnjiga spisakKnjiga, Jezik jezik) {

		for (Knjiga knjiga : spisakKnjiga.getKnjige()) {

			if (knjiga.getJezik().equals(jezik)) {
				ispisKnjige(knjiga);
			}

		}
	}

	/**
	 * Ispisujemo sve knjige cija je godina izdanja izmedju unetih parametara
	 * odGodine i doGodine
	 * 
	 * @param spisakKnjiga saljemo spisak knjiga
	 * @param odGodine saljemo od koje godine proveravamo
	 * @param doGodine saljemo do koje godine proveravamo
	 * 
	 */
	public void ispisKnjigaIzmedjuGodinaIzdanja(SpisakKnjiga spisakKnjiga, int odGodine, int doGodine) {

		for (Knjiga knjiga : spisakKnjiga.getKnjige()) {

			if ((knjiga.getGodina().getGodina() >= odGodine) && (knjiga.getGodina().getGodina() <= doGodine)) {
				ispisKnjige(knjiga);
			}

		}
	}

	/**
	 * Vrsimo narudzbinu
	 * 
	 * @param spisakKnjiga saljemo spisak knjiga
	 * @param korpa saljemo korpu sa knjigama
	 * 
	 */
	public void narudzbina(SpisakKnjiga spisakKnjiga, Korpa korpa) {

		int ukupnaCena = 0;
		for (Knjiga knjiga : korpa.getKnjige()) {

			ukupnaCena += knjiga.getCena().getCena();
			System.out.print(knjiga.getNaslov().getNaslov() + "\t" + knjiga.getCena().getCena() + " RSD");
			System.out.println();
		}
		System.out.println("Ukupno: " + ukupnaCena + " RSD");
	}

	/**
	 * Dodajemo knjige u korpu
	 * 
	 * @param spisakKnjiga saljemo spisak knjiga
	 * @param korpa saljemo korpu sa knjigama
	 * @param naziv saljemo naziv knjige
	 * 
	 */
	public void dodajUKorpu(SpisakKnjiga spisakKnjiga, Korpa korpa, String naziv) {

		for (Knjiga knjiga : spisakKnjiga.getKnjige()) {

			if (knjiga.getNaslov().getNaslov().equalsIgnoreCase(naziv)) {
				korpa.add(knjiga);
			}

		}

	}
}
