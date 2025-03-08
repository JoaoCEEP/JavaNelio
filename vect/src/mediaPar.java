import java.util.Scanner;

public class mediaPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media = 0;
        int total = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                media = media + vetor[i];
                total++;
            }
        }

        media = media / total;

        if (total == 0) {
            System.out.println("Nenhum número par");
        } else {
            System.out.println("Média dos números pares: " + media);
        }
    }
}
