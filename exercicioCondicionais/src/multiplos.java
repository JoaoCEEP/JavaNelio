import java.util.Scanner;

public class multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;
        double resultado;

        A = sc.nextInt();
        B = sc.nextInt();

        if (A >= B) {
            if (A % B == 0){
                System.out.println("São multiplos");
            } else {
                System.out.println("Não são multiplos");
            }
        } else {
            if (B % A == 0){
                System.out.println("São multiplos");
            } else {
                System.out.println("Não são multiplos");
            }
        }
    }
}
