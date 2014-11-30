public class NizStringova {// Program radi sa svakim divider znakom osim razmak
	public static void main(String[] args) {
		String unos = TextIO.getln();
		char divider = TextIO.getChar();
		String[] razdijeljen = razdijeli(unos, divider);
		ispisi(razdijeljen);

	}

	/**
	 * Ispisuje niz stringova
	 * 
	 * @param razdijeljen
	 *            Niz stringova za ispis
	 */
	public static void ispisi(String[] razdijeljen) {
		for (int i = 0; i < razdijeljen.length; i++) {
			System.out.println(razdijeljen[i]);
		}// kraj for-a

	}

	/**
	 * Razdjeljuje stringove na osnovu unesenog char-a i stavlja ih u niz
	 * stringova
	 * 
	 * @param unos
	 *            String koji se dijeli
	 * @param divider
	 *            Znak koji razdvaja stringove
	 * @return Niz od stringova razdijeljenih stringova
	 */
	public static String[] razdijeli(String unos, char divider) {
		String[] novi = new String[velicina(unos, divider)];
		int clan = 0;
		int domet = unos.length();
		int pocetak = 0;
		String zadnji = "";
		for (int i = 0; i < domet; i++) {
			if (unos.charAt(i) == divider) {
				novi[clan] = unos.substring(pocetak, i);
				clan++;
				pocetak = i + 1;
				zadnji = unos.substring(i + 1, unos.length());
			}// kraj if-a
		}// kraj for-a
		novi[novi.length - 1] = zadnji;
		return novi;
	}

	/**
	 * Vraca velicinu novog niza stringova u koji s trebaju ubaciti razdijeljeni
	 * stringovi
	 * 
	 * @param unos
	 *            String koji se razdijeljuje
	 * @param divider
	 *            Znak koji razdvaja stringove
	 * @return Velicinu niza razdijeljenih stringova
	 */
	public static int velicina(String unos, char divider) {
		int brojac = 1;
		for (int i = 0; i < unos.length(); i++) {
			if (unos.charAt(i) == divider)
				brojac++;
		}// kraj for-a
		return brojac;
	}

}
