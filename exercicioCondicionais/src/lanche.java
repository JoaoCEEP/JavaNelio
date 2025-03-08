import java.util.Scanner;

public class lanche {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Escolha o produto e quantidade:
                1 - Cachorro-quente, R$4,00
                2 - X-Salada, R$4,50
                3- X-Bacon, R$5,00
                4- Torrada Simples, R$2,00
                5 - Refrigerante, R$1,50
                """);

        int produto, quantidade;
        double valor = 0;
        produto = sc.nextInt();
        quantidade = sc.nextInt();

        if (produto == 1){
            valor = 4 * quantidade;
        } else if (produto ==2) {
            valor = 4.5 * quantidade;
        } else if (produto == 3) {
            valor = 5 * quantidade;
        } else if (produto == 4) {
            valor = 2 * quantidade;
        } else if (produto == 5) {
            valor = 1.5 * quantidade;
        } else {
            System.out.println("Opção invalida");
        }
        System.out.println("Valor total: " + valor);
    }
}
