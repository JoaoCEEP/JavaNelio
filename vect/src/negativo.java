import java.util.Scanner;

public class negativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos número tu queres digitar? ");
        int n = sc.nextInt();
        int[] numero = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            numero[i] = sc.nextInt();
        }
        System.out.println("Números negativos: ");
        for (int i = 0; i < n; i++) {
            if (numero[i] < 0){
                System.out.println(numero[i]);
            }
        }
    }
}