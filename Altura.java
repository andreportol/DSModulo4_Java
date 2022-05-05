package devsuperior.DSModulo4_Java;

import java.util.Scanner;

public class Altura {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int quantidade, idade = 0;
		String nome = "";
		double altura = 0;

		System.out.print("Quantas pessoas serão digitadas: ");
		quantidade = s.nextInt();
		String[] nomes = new String[quantidade];
		double[] alturas = new double[quantidade];
		int[] idades = new int[quantidade];
		double soma_altura = 0, media_altura;
		double menor_idade = 0;

		// coletando dados
		for (int i = 0; i < quantidade; i++) {
			System.out.printf("Dados da %dº pessoa: \n", i + 1);
			System.out.print("Nome: ");
			nome = s.next();
			nomes[i] = nome;
			System.out.print("Idade: ");
			idade = s.nextInt();
			idades[i] = idade;
			System.out.print("Altura: ");
			altura = s.nextDouble();
			alturas[i] = altura;
		}

		System.out.println("*******************************************************");
		System.out.println(" ");

		// idade média
		for (int i = 0; i < quantidade; i++) {
			soma_altura = soma_altura + alturas[i];
		}
		media_altura = soma_altura / alturas.length;
		System.out.printf("Altura Media = %.2f", media_altura);
		System.out.println("");

		// menor de 16 anos
		for (int i = 0; i < quantidade; i++) {
			if (idades[i] < 16) {
				menor_idade += 1;
				System.out.print(nomes[i] + "  ");
			}
		}
		// Mostrar nomes dos menores que 16 anos
		System.out.print("Nomes menor que 16 anos: ");
		for (int i = 0; i < quantidade; i++) {
			if (idades[i] < 16) {
				System.out.print(nomes[i] + "  ");
			}
		}
		System.out.println("");

		// porcentagem
		double porcentagem = (menor_idade / idades.length) * 100;
		System.out.printf("Porcentagem de pessoas menor que 16 anos: %.2f", porcentagem);
		System.out.print("%");

		s.close();
	}

}
