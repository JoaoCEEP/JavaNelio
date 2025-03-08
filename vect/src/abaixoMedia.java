import java.util.Scanner;

public class abaixoMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
            media = media + vetor[i];
        }
        media = media / n;
        System.out.printf("Media do vetor = %.3f%n", media);
        System.out.println("Elementos abaixo da média: ");
        for (int i = 0; i < n; i++) {
            if (vetor[i] < media) {
                System.out.println(vetor[i]);
            }
        }
    }
}
