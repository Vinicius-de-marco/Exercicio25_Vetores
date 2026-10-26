
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int n = 20;
        int vetor[] = new int[n];
        Scanner leitor = new Scanner(System.in);

        //entrada
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o valor (" + i + "):");
            vetor[i] = Integer.parseInt(leitor.nextLine());
        }
        //processamento
        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma = soma + vetor[i];
        }

        double media = soma / n;

        //saída
        System.out.println("A média é: " + media);
        System.out.println("A soma é: " + soma);
    }
}
