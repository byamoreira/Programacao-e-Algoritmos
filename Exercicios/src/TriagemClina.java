import java.util.Scanner;
public class TriagemClina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a idade do paciente: ");  // Entrada de dados
        int idade = scanner.nextInt();

        System.out.print("Informe o tipo de plano (1 - Convênio, 2 - Particular): ");
        int plano = scanner.nextInt();

        System.out.println("Informe a especialidade desejada:");
        System.out.println("1 - Clínica Geral");
        System.out.println("2 - Pediatria");
        System.out.println("3 - Cardiologia");
        System.out.println("4 - Ortopedia");
        System.out.print("Opção: ");
        int especialidade = scanner.nextInt();

        System.out.println();

        // Definindo prioridade de atendimento
        if (idade >= 65) {
            System.out.println("Atendimento prioritário (Idoso)");
        } else if (idade <= 12) {
            System.out.println("Atendimento prioritário (Criança)");
        } else {
            System.out.println("Atendimento comum");
        }

        // Exibindo especialidade
        switch (especialidade) {
            case 1:
                System.out.println("Especialidade: Clínica Geral");
                break;
            case 2:
                System.out.println("Especialidade: Pediatria");
                break;
            case 3:
                System.out.println("Especialidade: Cardiologia");
                break;
            case 4:
                System.out.println("Especialidade: Ortopedia");
                break;
            default:
                System.out.println("Especialidade inválida");
                break;
        }

        // Exibindo valor da consulta
        if (plano == 1) { // Convênio
            if (idade > 60) {
                System.out.println("Isento de taxa de consulta");
            } else {
                System.out.println("Taxa reduzida: R$40,00");
            }
        } else if (plano == 2) { // Particular
            System.out.println("Taxa integral: R$100,00");
        } else {
            System.out.println("Tipo de plano inválido");
        }

        scanner.close();
    }
}