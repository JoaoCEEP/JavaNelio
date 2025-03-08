import java.util.Scanner;

public class par {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0;

        System.out.print("Quantos números deseja digitar? ");
        int n = sc.nextInt();
        int[] numero = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numero[i] = sc.nextInt();
        }

        System.out.println("Números pares: ");
        for (int i = 0; i < n; i++) {
            if (numero[i] % 2 == 0){
                System.out.print(" " + numero[i]);
                pares++;
            }
        }
        System.out.println();
        System.out.println("Quantidade de números pares = " + pares);
    }
}
