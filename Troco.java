package devsuperior.DSModulo4_Java;

import java.util.Locale;
import java.util.Scanner;

public class Troco {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// vari�veis
		final var localeAmericano = new Locale("en", "US");
		double preco, dinheiro;
		int quantidade;
			
		
		System.out.println("Pre�o unit�rio do produto: ");
		// nextDouble usar� o Locale criado gra�as ao m�todo useLocale
		preco = s.useLocale(localeAmericano).nextDouble();
		System.out.println("Quantidade comprada: ");
		quantidade = s.nextInt();
		System.out.println("Dinheiro recebido: ");
		dinheiro = s.nextDouble();
		double troco = dinheiro - (preco * quantidade);
		System.out.println("Troco = " + troco);
			
		s.close();
	}

}
