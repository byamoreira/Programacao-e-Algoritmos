import java.util.Scanner;

public class PraticaGuiada2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senhaCorreta = 1234;
        int senhaDigitada;

        System.out.print("Digite a senha: ");
        senhaDigitada = scanner.nextInt();

        while (senhaDigitada != senhaCorreta) {
            System.out.println("Senha incorreta.");
            System.out.print("Tente novamente: ");
            senhaDigitada = scanner.nextInt();
        }

        System.out.println("Acesso permitido.");
        scanner.close();
    }
}