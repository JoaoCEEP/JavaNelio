import java.util.Scanner;

public class maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números quer digitar? ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        double maiorzao = vetor[0];
        int posmaior = 0;

        for (int i=1; i<n; i++) {
            if (vetor[i] > maiorzao) {
                maiorzao = vetor[i];
                posmaior = i;
            }
        }
        System.out.printf("MAIOR VALOR = %.1f\n", maiorzao);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);
    }
}
