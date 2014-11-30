public class PomjeranjeULijevo {

	public static void main(String[] args) {
		int velicinaNiza = TextIO.getInt();
		int[] niz = new int[velicinaNiza];
		unos(niz);
		pomjeriULijevo(niz);

	}

	/**
	 * Pomjera clanove niza u lijevo, s tim da zadnji clan postaje 0
	 * 
	 * @param niz
	 *            Niz koji se manipulise
	 */

	public static void pomjeriULijevo(int[] niz) {
		for (int i = 0; i < niz.length - 1; i++) {
			niz[i] = niz[i + 1];
		}// kraj for-a
		niz[niz.length - 1] = 0;

	}

	/**
	 * 
	 * Sluzi za unos niza korisnika
	 * 
	 * @param niz
	 *            Niz u koji se ubacuju brojevi
	 */
	public static void unos(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			niz[i] = TextIO.getInt();
		} // kraj for-a

	}

}
