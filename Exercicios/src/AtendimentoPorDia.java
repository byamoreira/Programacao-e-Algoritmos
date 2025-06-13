import java.util.Scanner;

public class AtendimentoPorDia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número do dia da semana (1 a 7): ");
        int dia = scanner.nextInt();

        String departamento;
        switch (dia) {
            case 1:
                departamento = "Atendimento Geral";
                break;
            case 2:
                departamento = "Suporte Técnico";
                break;
            case 3:
                departamento = "Financeiro";
                break;
            case 4:
                departamento = "Recursos Humanos";
                break;
            case 5:
                departamento = "Vendas";
                break;
            case 6:
                departamento = "Marketing";
                break;
            case 7:
                departamento = "Fechado (Fim de semana)";
                break;
            default:
                departamento = "Dia inválido";
        }

        System.out.println("Departamento: " + departamento);
        scanner.close();
    }
}