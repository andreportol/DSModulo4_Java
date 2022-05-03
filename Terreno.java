package devsuperior;

import java.util.Locale;
import java.util.Scanner;

public class Terreno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		double largura, comprimento, valor_Metro;
		double area, valorTerreno;
		System.out.print("Digite a largura do terreno:");
		largura = s.nextDouble();
		System.out.print("Digite o comprimento do terreno:");
		comprimento = s.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		valor_Metro = s.nextDouble();
		area = comprimento * largura;
		valorTerreno = area * valor_Metro;
		System.out.printf("Área do terreno = %.2f\n", area);
		System.out.printf("Valor da preço do terreno = %.2f%n", valorTerreno);
		
		
		s.close();
	}

}
