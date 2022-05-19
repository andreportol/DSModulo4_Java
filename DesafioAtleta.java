import java.util.Locale;
import java.util.Scanner;

class DesafioAtleta {
    Scanner s = new Scanner(System.in);
    // variáveis
    int quantidade = 0;
    // vetores
    String[] nome = new String[99];
    String[] sexo = new String[99];
    double[] altura = new double[99];
    double[] peso = new double[99];

    // métodos
    public void inserirDadosAtletas() {
        System.out.print("Qual a quantidade de atletas? ");
        this.quantidade = s.nextInt();
        s.nextLine(); // capturar tecla enter
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Digite os dados do atleta numero %d: %n", i + 1);
            System.out.print("Nome: ");
            this.nome[i] = s.nextLine();
            System.out.print("Sexo: ");
            String sexo = s.next();
            this.sexo[i] = validarSexoAtleta(sexo);
            System.out.print("Altura: ");
            double altura = s.nextDouble();
            this.altura[i] = validarAlturaAtleta(altura);
            System.out.print("Peso: ");
            double peso = s.nextDouble();
            this.peso[i] = validarPesoAtleta(peso);
            s.nextLine(); // capturar tecla enter
        }
    }

    private String validarSexoAtleta(String sexo1) {
        String sexo = String.valueOf(sexo1);
        sexo.toUpperCase();
        while (sexo.equals("M") && sexo.equals("F")) {
            System.out.print("Valor invalido! Favor digitar F ou M:");
            sexo = s.next();
        }
        return sexo;
    }

    private double validarAlturaAtleta(double altura) {
        while (altura <= 0) {
            System.out.print("Valor invalido! Favor digitar um valor positivo:");
            altura = s.nextDouble();
        }
        return altura;
    }

    private double validarPesoAtleta(double peso) {
        while (peso <= 0) {
            System.out.print("Valor invalido! Favor digitar um valor positivo:");
            peso = s.nextDouble();
        }
        return peso;
    }

    private double calcularPesoMedio() {
        double soma = 0;
        int tamanho = this.quantidade;
        for (int i = 0; i < tamanho; i++) {
            soma += this.peso[i];
        }
        return soma / tamanho;
    }

    private String verificarNomeAtletaAlto() {
        double maiorAltura = 0;
        String nome = "";
        for (int i = 0; i < quantidade; i++) {
            if (this.altura[i] > maiorAltura) {
                maiorAltura = this.altura[i];
                nome = this.nome[i];
            }
        }
        return nome;
    }

    private double calcularPorcentagemHomens() {
        double contaSexo = 0;
        for (int i = 0; i < this.quantidade; i++) {
            if (sexo[i].equals("M")) {
                contaSexo += 1;
            }
        }
        return (contaSexo / this.quantidade) * 100;
    }

    private String calcularAlturaMedia_M() {
        double contaMulher = 0;
        double altura = 0;
        String mensagem = "Não há mulheres cadastradas";
        for (int i = 0; i < this.quantidade; i++) {
            if (sexo[i].equals("F")) {
                contaMulher += 1;
                altura += this.altura[i];
            }
        }
        if (contaMulher == 0) {
            return mensagem;
        }
        String alturaString = String.valueOf(altura / contaMulher);
        return alturaString;
    }

    public void exibirRelatorio() {
        System.out.println("RELATÓRIO:");
        System.out.printf("Peso médio dos atletas: %.2f%n", calcularPesoMedio());
        System.out.printf("Atleta mais alto: %s%n", verificarNomeAtletaAlto());
        System.out.printf("Porcentagem de homens: %.1f %%%n", calcularPorcentagemHomens());
        System.out.printf("Altura média das mulheres: %s%n", calcularAlturaMedia_M());
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // instanciando um objeto
        DesafioAtleta atleta = new DesafioAtleta();
        atleta.inserirDadosAtletas();
        atleta.exibirRelatorio();
    }
}