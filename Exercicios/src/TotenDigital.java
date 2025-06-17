import java.util.Scanner;

public class TotenDigital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibição do meu menu
            System.out.println("\n== Totem Digital ==");
            System.out.println("1 - Dizer Olá");
            System.out.println("2 - Exibir Data de devolução Fictícia");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            // Tratamento das opções
            switch (opcao) {
                case 1:
                    System.out.println("Olá! Bem-vindo ao Totem Digital!");
                    break;
                case 2:
                    System.out.println("Data fictícia: 17/06/2025");
                    break;
                case 3:
                    System.out.println("Encerrando o sistema");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha entre 1 e 3.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}