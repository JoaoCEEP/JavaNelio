import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tentativa = sc.nextInt();

        while (tentativa != 2002){
            System.out.println("Senha invalída");
            tentativa = sc.nextInt();
        }
        System.out.println("Acesso liberado");
    }
}