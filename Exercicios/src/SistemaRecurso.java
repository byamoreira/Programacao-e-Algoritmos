
import java.util.Scanner;

    public class SistemaRecurso {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a nota (0 a 100): ");
            int nota = scanner.nextInt();

            if (nota >= 90 && nota <= 100) {
                System.out.println("Conceito: A");
            } else if (nota >= 80) {
                System.out.println("Conceito: B");
            } else if (nota >= 70) {
                System.out.println("Conceito: C");
            } else if (nota >= 60) {
                System.out.println("Conceito: D");
            } else if (nota >= 0) {
                System.out.println("Conceito: F");
            } else {
                System.out.println("Nota inválida!");
            }


        }
    }



















