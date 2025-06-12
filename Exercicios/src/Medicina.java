import java.util.Scanner;

public class Medicina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura corporal em °C: ");
        double temperatura = scanner.nextDouble();

        if (temperatura < 36.0) {
            System.out.println("Diagnóstico: Hipotermia");
        } else if (temperatura >= 36.0 && temperatura <= 37.4) {
            System.out.println("Diagnóstico: Temperatura Normal");
        } else if (temperatura >= 37.5 && temperatura <= 38.5) {
            System.out.println("Diagnóstico: Febre Leve");
        } else if (temperatura >= 38.6 && temperatura <= 39.9) {
            System.out.println("Diagnóstico: Febre Moderada");
        } else if (temperatura == 40.0) {
            System.out.println("Diagnóstico: Febre Alta");
        } else {
            System.out.println("Valor fora da faixa avaliada. Verifique os dados.");
        }

        scanner.close();
    }
}