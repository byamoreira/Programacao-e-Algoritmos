import java.util.Scanner;

public class CondicaoComWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;


        System.out.print("Digite um número inteiro positivo: ");
        N = scanner.nextInt();


        while (N <= 0) {
            System.out.println("Por favor, digite um número POSITIVO!");
            System.out.print("Digite novamente: ");
            N = scanner.nextInt();
        }

        int contador = 1;

        System.out.println("Contagem de 1 até " + N + ":");


        while (contador <= N) {
            System.out.println(contador);
            contador++;
        }

        scanner.close();
    }
}