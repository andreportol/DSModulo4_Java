package devsuperior.DSModulo4_Java;

import java.util.Scanner;

public class DesafioImposto {
	public static void main(String[] args) {
		// inicializando as vari�veis
		double renda_salario = 0, renda_prest = 0, renda_capital = 0;
		double gastos_med = 0, gastos_edu = 0, gasto_total = 0;
		double imp_salario, imp_prest, imp_capital, imp_total = 0, imposto_bruto;
		double max_dedutivel = 0;
		// adicioando valores as vari�veis
		Scanner s = new Scanner(System.in);
		System.out.print("Renda anual com sal�rio: ");
		renda_salario = s.nextDouble();
		System.out.print("Renda anual com presta��o de servi�o: ");
		renda_prest = s.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		renda_capital = s.nextDouble();
		System.out.print("Gastos m�dicos: ");
		gastos_med = s.nextDouble();
		System.out.print("Gastos educacionais: ");
		gastos_edu = s.nextDouble();

		// calculando os valores do imposto salario
		if (renda_salario < 36000) {
			imp_salario = 0;
		} else if (renda_salario >= 36000 && renda_salario < 60000) {
			imp_salario = renda_salario * 0.1;
		} else {
			imp_salario = renda_salario * 0.2;
		}
		// calculando os valores do imposto sobre presta��o de servi�os
		if (renda_prest > 0) {
			imp_prest = renda_prest * 0.15;
		} else {
			imp_prest = 0;
		}
		// calculando os valores do imposto sobre ganho capital
		if (renda_capital > 0) {
			imp_capital = renda_capital * 0.20;
		} else {
			imp_capital = 0;
		}
		// dedu��o dos impostos com gastos m�dicos e educacionais
		imp_total = imp_salario + imp_prest + imp_capital;
		imposto_bruto = imp_total * 0.3;
		gasto_total = gastos_med + gastos_edu;

		if (imposto_bruto < gasto_total) {
			max_dedutivel = imposto_bruto;
		} else {
			max_dedutivel = gasto_total;
		}
		// exibindo valores no console
		System.out.println("\n*********************RELATORIO DE IMPOSTO DE RENDA***************************");
		System.out.println("\n");
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre sal�rio: %.2f\n", imp_salario);
		System.out.printf("Imposto sobre servi�os: %.2f\n", imp_prest);
		System.out.printf("Imposto sobre ganho de capital: %.2f\n", imp_capital);
		System.out.println("\n\nDEDU��ES:");
		System.out.printf("M�ximo dedut�vel: %.2f\n", max_dedutivel);
		System.out.printf("Gastos dedut�veis: %.2f\n", gasto_total);
		System.out.println("\n\nRESUMO:");
		System.out.printf("Imposto bruto total: %.2f\n", imp_total);
		System.out.printf("Abatimento: %.2f\n", max_dedutivel);
		System.out.printf("Imposto devido: %.2f\n", (imp_total - max_dedutivel));

		s.close();
	}
}
