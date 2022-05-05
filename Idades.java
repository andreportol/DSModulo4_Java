package devsuperior.DSModulo4_Java;

import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nome1, nome2;
		double idade1, idade2;
		double media_Idade;
		System.out.println("Dados da primeira pessoa:");
		System.out.println("Nome: ");
		nome1 = s.nextLine();
		System.out.println("Idade: ");
		idade1 = s.nextDouble();
		s.nextLine();
		System.out.println("Nome: ");
		nome2 = s.nextLine();
		System.out.println("Idade: ");
		idade2 = s.nextDouble();
		media_Idade = (idade1 + idade2) / 2;
		System.out.printf("A idade média de %s e %s é de %.1f ", nome1,nome2,media_Idade);
		
		s.close();

	}

}
