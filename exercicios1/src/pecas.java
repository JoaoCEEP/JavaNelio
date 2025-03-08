import java.util.Scanner;

public class pecas extends produto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        produto peca1 = new produto();

        peca1.codigo = sc.nextInt();
        peca1.numeroPeca = sc.nextInt();
        peca1.valor = sc.nextDouble();

        produto peca2 = new produto();

        peca2.codigo = sc.nextInt();
        peca2.numeroPeca = sc.nextInt();
        peca2.valor = sc.nextDouble();

        double valorPagar = peca1.valor * peca1.numeroPeca + peca2.numeroPeca * peca2.valor;
        System.out.println(valorPagar);
    }
}
