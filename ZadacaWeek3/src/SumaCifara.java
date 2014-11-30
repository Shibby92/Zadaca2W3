public class SumaCifara {

	public static void main(String[] args) {
		int broj = TextIO.getInt();
		System.out.println(SumaCifara(broj));

	}

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

}
