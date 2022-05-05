package devsuperior.DSModulo4_Java;

import java.util.Locale;
import java.util.Scanner;

public class Troco {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// variáveis
		final var localeAmericano = new Locale("en", "US");
		double preco, dinheiro;
		int quantidade;
			
		
		System.out.println("Preço unitário do produto: ");
		// nextDouble usará o Locale criado graças ao método useLocale
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
