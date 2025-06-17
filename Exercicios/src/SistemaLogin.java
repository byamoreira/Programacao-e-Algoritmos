import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "java123";
        String senhaDigitada;
        int tentativas = 0;
        boolean acessoLiberado = false;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.next();

            tentativas++;

            if (senhaDigitada.equals(senhaCorreta)) {
                acessoLiberado = true;
                System.out.println("Bem-vindo!");
            } else if (tentativas == 3) {
                System.out.println("Acesso bloqueado");
            } else {
                System.out.println("Senha incorreta. Tentativas restantes: " + (3 - tentativas));
            }

        } while (!acessoLiberado && tentativas < 3);

        scanner.close();
    }
}