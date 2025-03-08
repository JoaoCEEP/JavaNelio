package application;

import entities.house;

import java.util.Scanner;

public class pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão cadastradas? ");
        int n = sc.nextInt();
        house[] vetor = new house[10];

        for (int i = 0; i < n; i++) {
            i++;
            System.out.println("Rent " + i + "#");
            i--;
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Email: ");
            String endereco = sc.next();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vetor[room] = new house(name, endereco, room);
        }
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] != null) {
                System.out.println(i + vetor[i].toString());
            }
        }

    }
}
