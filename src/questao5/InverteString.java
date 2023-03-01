package questao5;

import java.util.Scanner;

public class InverteString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe uma String: ");
		String original = scan.next();

		char[] caracteres = original.toCharArray();

		for (int i = 0, j = caracteres.length - 1; i < j; i++, j--) {
			char characterAtual = caracteres[i];
			caracteres[i] = caracteres[j];
			caracteres[j] = characterAtual;
		}

		String invertida = new String(caracteres);

		System.out.println("\nString original: " + original);
		System.out.println("String invertida: " + invertida);

		scan.close();
	}
}