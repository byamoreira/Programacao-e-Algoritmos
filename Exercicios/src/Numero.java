import java.util.Scanner;
public class Numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Informe o número: ");
                numeros[i] = scanner.nextInt();
            }
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("valor:" + numeros[i]);
            }
    }
}