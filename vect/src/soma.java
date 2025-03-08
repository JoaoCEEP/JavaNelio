import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0, media = 0;

        System.out.print("Quantos números iras digitar? ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }

        System.out.print("Valores = ");

        for (int i = 0; i < n; i++) {
            System.out.print(" " + vetor[i]);
            soma =+ vetor[i];
        }
        System.out.println();
        System.out.println(soma);
        media = soma / n;
        System.out.println(media);
    }
}
