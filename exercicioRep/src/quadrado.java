import java.util.Scanner;

public class quadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(i+" "+i*i+" "+i*i*i);
        }
    }
}
