import java.util.Scanner;

public class posto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int selecao = sc.nextInt();
        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;

        while (selecao != 4){
            if (selecao == 1){
                alcool++;
            } else if (selecao == 2) {
                gasolina++;
            } else if (selecao == 3) {
                diesel++;
            }
            selecao = sc.nextInt();
        }
        System.out.println("Muito obrigado");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
