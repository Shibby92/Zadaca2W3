public class Naopako {

	public static void main(String[] args) {
		String unos = TextIO.getln();
		naopacke(unos);
	}

	private static void naopacke(String unos) {
		for (int i = unos.length() - 1; i >= 0; i--) {
			System.out.print(unos.charAt(i));
		}// kraj for-a

	}

}
