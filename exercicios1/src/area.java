import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio = sc.nextDouble();
        double diametro = Math.pow(raio, 2);
        double area = pi * diametro;

        System.out.printf("%.4f%n", area);
    }
}
