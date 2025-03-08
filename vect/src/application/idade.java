package application;

import entities.age;

import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posIdade = 0, velho = 0;

        System.out.print("Quantas pessoas serão cadastradas? ");
        int n = sc.nextInt();
        age[] vetor = new age[n];

        for (int i = 0; i < n; i++) {
            i++;
            System.out.println("Dados da " + i + "a pessoa");
            i--;
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            vetor[i] = new age (name, age);
        }
        velho = vetor[0].idade;
        for (int i = 1; i < n; i++) {
            if (velho < vetor[i].idade) {
                velho = vetor[i].idade;
                posIdade = i;
            }
        }
        System.out.println("Pessoa mais velha: " + vetor[posIdade].nome);
    }
}
