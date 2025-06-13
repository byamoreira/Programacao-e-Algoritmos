import java.util.Scanner;

public class MaquinaDoces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo;

        System.out.print("Insira o valor de crédito inicial: R$ ");
        saldo = scanner.nextDouble();

        int opcao = 0;

        while (saldo > 0 && opcao != 4) {
            System.out.println("\n--- Menu de Produtos ---");
            System.out.println("1 - Bala (R$ 1.00)");
            System.out.println("2 - Chocolate (R$ 2.50)");
            System.out.println("3 - Refrigerante (R$ 4.00)");
            System.out.println("4 - Sair");

            System.out.printf("Seu saldo atual: R$ %.2f\n", saldo);
            System.out.print("Escolha um produto (1 a 4): ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (saldo >= 1.00) {
                        saldo -= 1.00;
                        System.out.printf("Você comprou uma bala. Saldo restante: R$ %.2f\n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente para comprar bala.");
                    }
                    break;
                case 2:
                    if (saldo >= 2.50) {
                        saldo -= 2.50;
                        System.out.printf("Você comprou um chocolate. Saldo restante: R$ %.2f\n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente para comprar chocolate.");
                    }
                    break;
                case 3:
                    if (saldo >= 4.00) {
                        saldo -= 4.00;
                        System.out.printf("Você comprou um refrigerante. Saldo restante: R$ %.2f\n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente para comprar refrigerante.");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando compras.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        System.out.printf("\nCompra finalizada. Saldo restante: R$ %.2f\n", saldo);
        scanner.close();
    }
}