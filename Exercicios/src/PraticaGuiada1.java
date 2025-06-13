public class PraticaGuiada1 {
    public static void main(String[] args) {
        int contador = 1; // contador começa em 1
        int soma = 0;
        while (contador <= 5) {
            soma = soma + contador;
            contador++;
        }
        System.out.println("A soma é: " + soma);
    }
}

