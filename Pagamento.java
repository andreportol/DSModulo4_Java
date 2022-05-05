package devsuperior;

import java.util.Locale;
import java.util.Scanner;

public class Pagamento {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String nome;
		double valor_Hora, pagamento;
		int horas_Trabalhadas;
		final var localeAmericano = new Locale("en","US");
		
		System.out.println("Nome: ");
		nome = s.nextLine();
		System.out.println("Valor por hora: ");
		valor_Hora = s.useLocale(localeAmericano).nextDouble();
		System.out.println("Horas trabalhadas: ");
		horas_Trabalhadas = s.nextInt();
		pagamento = valor_Hora * horas_Trabalhadas;
		System.out.printf("O pagamento para %s deve ser R$ %.2f.", nome, pagamento);
		
		
		
		
		
		s.close();
	}
}
