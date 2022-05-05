package devsuperior.DSModulo4_Java;

import java.util.Arrays;
import java.util.Scanner;

public class SomaVetor {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int quantidade;
		
		System.out.print("Quantos números vc vai digitar: ");
		quantidade = s.nextInt();
		double[] num = new double[quantidade];
		double soma, media;
		
		for(int i=0; i < quantidade; i++) {
			System.out.print("Digite um número: ");
			double num_digitado = s.nextDouble();
			num[i] = num_digitado;
		}
		System.out.print("Valores: ");
		for (int i=0; i < quantidade; i++) {
			System.out.print(num[i]+ " ");
		}
		System.out.println(" ");
		// método utilizado para somar os elementos de um array
		soma = Arrays.stream(num).sum();
		System.out.print("SOMA = " + soma);
		media = soma / num.length;
		System.out.println(" ");
		System.out.printf("MEDIA = %.3f" , media);
		
		s.close();
	}
}
