public class ZadnjihDesetBrojeva {
	/**
	 * Pomjera clanove niza u lijevo, s tim da zadnji clan postaje novi unos
	 * 
	 * @param niz
	 *            Niz koji se manipulise
	 */

	public static void pomjeriULijevo(int[] niz, int broj) {
		for (int i = 0; i < niz.length - 1; i++) {
			niz[i] = niz[i + 1];
		}// kraj for-a
		niz[niz.length - 1] = broj;

	}

	/**
	 * 
	 * Sluzi za unos niza korisnika prvih deset brojeva
	 * 
	 * @param niz
	 *            Niz u koji se ubacuju brojevi
	 */
	public static void unos(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			niz[i] = TextIO.getInt();
		} // kraj for-a

	}

	/**
	 * Ispisuje uneseni niz
	 * 
	 * @param niz
	 *            Niz koji se ispisuje tipa integer
	 */
	public static void ispisi(int[] niz) {
		for (int tmp : niz) {
			System.out.println(tmp);
		}// kraj for-a
	}

	public static void main(String[] args) {
		int[] niz = new int[10];
		unos(niz);
		int broj = 0;
		while (broj != -1) {
			pomjeriULijevo(niz, broj);
			broj = TextIO.getInt();
		} // kraj while-a
		ispisi(niz);

	}

}
