import java.util.Scanner;

public class CalculadoraEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        double soma = 0;
        int quantidadeNotas = 0;

        do {
            System.out.print("Digite uma nota entre 0 e 10 (ou um número negativo para finalizar): ");
            nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                soma += nota;
                quantidadeNotas++;
            } else if (nota >= 0) {
                System.out.println("Nota inválida! Digite apenas valores entre 0 e 10.");
            }

        } while (nota >= 0);

        if (quantidadeNotas > 0) {
            double media = soma / quantidadeNotas;
            System.out.printf("Média das notas: %.2f%n", media);
        } else {
            System.out.println("Nenhuma nota válida foi informada.");
        }

        scanner.close();
    }
}