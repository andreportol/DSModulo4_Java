package devsuperior.DSModulo4_Java;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		final var localeAmericano = new Locale("en","US");
		double distancia, combustivel, consumo;
		
		System.out.println("Distancia percorrida: ");
		distancia = s.useLocale(localeAmericano).nextDouble();
		System.out.println("Combustível gasto: ");
		combustivel = s.nextDouble();
		consumo = distancia / combustivel;
		System.out.printf("Consumo médio: %.3f.", consumo);
		
		
		
		
		s.close();
	}
}
