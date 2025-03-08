import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha: ");

        int senha = 2500;
        int digitacao = sc.nextInt();

        if (digitacao == senha){
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Senha incorreta");
        }
    }
}
