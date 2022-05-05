package devsuperior.DSModulo4_Java;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		double base, altura, area=0, perimetro, diagonal;
		
		System.out.print("Base do retângulo: ");
		base = s.nextDouble();
		System.out.print("Altura do retângulo: ");
		altura = s.nextDouble();
		area = base * altura;
		perimetro = base*2 + altura*2;
		diagonal = Math.sqrt((Math.pow(base,2) + Math.pow(altura,2)));
		System.out.printf("Area = %.4f\n",area);
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f\n", diagonal);
		
		
		
		
		
		s.close();

	}

}
