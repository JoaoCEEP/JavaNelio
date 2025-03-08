package applicantion;
import entities.bank;

import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        bank bk = new bank();

        System.out.print("Enter account number: ");
        bk.numero(sc.nextInt());
        System.out.print("Enter account holder: ");
        bk.setNome(sc.next());
        System.out.print("Is there initial deposit (y/n)? ");
        bk.setVerificacao(sc.next().charAt(0));

        if (bk.getVerificacao() == 'y'){
            System.out.print("Enter initial deposit value: ");
            bk.setDepositoInicial(sc.nextDouble());
        }

        System.out.println(bk.toString());
        System.out.print("Enter a deposit value: ");
        bk.deposito(sc.nextDouble());
        System.out.println(bk.toString());
        System.out.print("Enter a withdraw value: ");
        bk.saque(sc.nextDouble());
        System.out.println(bk.toString());
    }
}
