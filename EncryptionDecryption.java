package projects;

public class EncryptionDecryption {

	public static void main(String[] args) {
		String g = "My name is saad";
		int key = 4;

		char[] code = g.toCharArray();

		System.out.println(code);
		System.out.println("The encrupted code for this would be: ");
		

		for (char c : code) {
			c += key;
			System.out.print(c);
		}
		System.out.println();
		System.out.println();
		System.out.println();

		String x = "Q}$reqi$mw$weeh";

		System.out.println(x);
		System.out.println("The decrypted sentance for this would be: ");

		char[] code2 = x.toCharArray();
		for (char z : code2) {
			z -= key;
			System.out.print(z);
		}

	}

}
