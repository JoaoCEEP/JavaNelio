import java.util.Scanner;

public class diferenca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        double diferenca = A * B - C * D;

        System.out.println(diferenca);
    }
}
