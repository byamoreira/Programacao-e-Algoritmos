import java.util.Scanner;
public class ClassificacaoIdade {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("digite a idade:");
            int idade = scanner.nextInt();

            if (idade < 18) {
                System.out.print("menor de idade");
                idade = scanner.nextInt();
            }
            else if (idade <= 59)
            {
                System.out.print("maior de idade");
            }
            idade = scanner.nextInt();
            }









}













