import java.util.Scanner;

public class ContagemAteN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        System.out.print("Digite um número inteiro positivo: ");
        N = scanner.nextInt();

        while (N <= 0) {
            System.out.println("Por favor, digite um número inteiro POSITIVO!");
            System.out.print("Digite novamente: ");
            N = scanner.nextInt();
        }

        int contador = 1;

        System.out.println("Contagem de 1 até " + N + ":");

        do {
            System.out.println(contador);
            contador++;
        } while (contador <= N);

        scanner.close();
    }
}
//questão 5
//Principal diferença:
//No while, a condição é verificada antes da execução do bloco de código.
//No do-while, o bloco de código é executado pelo menos uma vez, pois a condição só é testada após a execução.
//	Situação prática para uso do do-while:
//
//Quando precisamos garantir que o menu de um sistema ou uma leitura de dados seja exibida/executada ao menos uma vez, como em um menu de autoatendimento de um banco que deve aparecer sempre antes de o usuário fazer uma escolha.
// letra B
//o contador do while permite contar quantas entradas validas o usuário entrega
//acumulador: ele soma valores digitados ex: medias de notas
//os dois juntos controlam quantas vezes o laço sera executado e dao o valor final
//
//letra C
//o do while exibe o menu pelo menos uma vez, msmo que o usuário digite a opção de saída na primeira vez
//o laço garante mantem o programa ate q o usuário escolha sair
//a vantagem e que ele melhora a iteratividade
//e tbm evita erros de fluxos