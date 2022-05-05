package devsuperior.DSModulo4_Java;

import java.util.Scanner;

public class Lendo_Variaveis {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um valor inteiro, um double, uma String e uma frase: ");
		int x = s.nextInt();
		double y = s.nextDouble();
		String z = s.next(); // lê apenas uma palavra
		s.nextLine();// é utilizado para consumir o "enter" quando digitado.
		String h = s.nextLine(); // lê uma frase
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(h);
		s.close();
	}
}
