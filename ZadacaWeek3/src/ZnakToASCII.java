public class ZnakToASCII {

	public static void main(String[] args) {
		System.out.println("Unesi neki karakter: ");
		char broj = TextIO.getChar();
		System.out.printf(
				"Znak ima ASCII �ifru %d .Prethodnik je %c, a sljedbenik %c",
				(int) broj, broj - 1, broj + 1);

	}

}
