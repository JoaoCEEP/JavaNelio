package applicantion;

import java.util.Scanner;
import entities.currencyConverter;

public class doleta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price: ");
        currencyConverter.dolar = sc.nextDouble();
        System.out.print("How many dollars will be bought: ");
        currencyConverter.valorDolar = sc.nextDouble();
        System.out.println("Amount to be paid in reais = " + currencyConverter.conversao());
    }
}
