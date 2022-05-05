package devsuperior.DSModulo4_Java;

import java.util.Locale;
import java.util.Scanner;

public class Circulo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		final var localeAmericano = new Locale("en", "US");
		double raio, pi = Math.PI;
		double area;
		
		
		System.out.println("Digite o valor do raio do circulo: ");
		raio = s.useLocale(localeAmericano).nextDouble();
		area = pi * Math.pow(raio,2);
		System.out.printf("AREA: %.3f ", area);
		
		
		
		s.close();
	}
}
