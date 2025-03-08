import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        if (numero >= 0){
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
    }
}