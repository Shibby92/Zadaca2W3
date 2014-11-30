public class DjeljiviSaSumomCifara {
	/**
	 * Sabira sumu cifara broja
	 * 
	 * @param broj
	 *            Broj cije se cifre sabiraju
	 * @return Sumu cifri unesenog broja
	 */
	public static int SumaCifara(int broj) {
		int suma = 0;
		while (broj != 0) {
			suma += broj % 10;
			broj /= 10;
		}// kraj while-a
		return suma;
	}

	public static void main(String[] args) {
		int broj = TextIO.getInt();
		DjeljiviSaSumom(SumaCifara(broj));

	}

	/**
	 * Ispisuje brojeve koji su djeljivi sa unesenim od 1 - unesenog broja
	 * 
	 * @param sumaCifara
	 *            Uneseni broj koji se ispituje
	 */

	public static void DjeljiviSaSumom(int sumaCifara) {
		for (int i = 1; i <= sumaCifara; i++) {
			if (sumaCifara % i == 0)
				System.out.println(i);
		} // kraj for-a

	}

}
