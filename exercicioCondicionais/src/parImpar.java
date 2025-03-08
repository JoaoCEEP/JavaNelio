import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("Número par");
        } else {
            System.out.println("Número impar");
        }
    }
}
