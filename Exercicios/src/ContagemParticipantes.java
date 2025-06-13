import java.util.Scanner;


public class ContagemParticipantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, contador = 1;

        System.out.print("Digite um número inteiro maior que zero: ");
        n = scanner.nextInt();

        while (contador <= n) {
            System.out.println("Participante número: " + contador);
            contador++;
        }

        scanner.close();
    }
}