import java.util.Scanner;

public class somaAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números vai ter cada vetor? ");
        int n = sc.nextInt();
        int[] vetor1 = new int[n];
        int[] vetor2 = new int[n];

        System.out.println("Digite o valor do vetor 1: ");
        for (int i = 0; i < n; i++) {
            vetor1[i] = sc.nextInt();
        }

        System.out.println("Digite o valor do vetor 2: ");
        for (int i = 0; i < n; i++) {
            vetor2[i] = sc.nextInt();
        }

        System.out.println("Vetor resultante: ");
        for (int i = 0; i < n; i++) {
            System.out.println(vetor1[i] + vetor2[i]);
        }
    }
}
