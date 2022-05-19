import java.util.Scanner;

class DesafioAtleta {
    Scanner s = new Scanner(System.in);
    // variáveis
    int quantidade;
    // vetores
    String[] nome = new String[99];
    char[] sexo = new char[99];
    double[] altura = new double[99];
    double[] peso = new double[99];
    // vetores

    // métodos
    public void inserirDadosAtletas() {
        System.out.print("Qual a quantidade de atletas? ");
        this.quantidade = s.nextInt();
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Digite os dados do atleta numero %d: \n", i + 1);
            System.out.print("Nome: ");
            this.nome[i] = s.next();
            System.out.print("Sexo: ");
            char sexo = s.next().charAt(0);
            this.sexo[i] = validarSexoAtleta(sexo);
            System.out.print("Altura: ");
            double altura = s.nextDouble();
            this.altura[i] = validarAlturaAtleta(altura);
            System.out.print("Peso: ");
            double peso = s.nextDouble();
            this.peso[i] = validarPesoAtleta(peso);
        }
    }

    private char validarSexoAtleta(char sexo) {
        while (sexo != 'M' && sexo != 'F') {
            System.out.print("Valor invalido! Favor digitar F ou M:");
            sexo = s.next().charAt(0);
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
        return soma/tamanho;
    }

    public static void main(String[] args) {

        // instanciando um objeto
        DesafioAtleta atleta = new DesafioAtleta();
        atleta.inserirDadosAtletas();
        System.out.println(atleta.calcularPesoMedio());
        
    }
}