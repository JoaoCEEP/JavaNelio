package application;
import entities.height;

import java.util.Scanner;

public class altura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media = 0;
        double menos = 0;

        System.out.print("Quantas pessoas serão cadastradas? ");
        int n = sc.nextInt();
        height[] vetor = new height[n];

        for (int i = 0; i < n; i++) {
            i++;
            System.out.println("Dados da " + i + "a pessoa");
            i--;
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double tamanho = sc.nextDouble();
            vetor[i] = new height (name, age, tamanho);
            media = media + tamanho;
            if (age < 16){
                menos++;
            }
        }
        media = media / 2;
        System.out.println("Altura média: " + media);
        menos = menos / n * 100;
        System.out.println("Pessoas com menos de 16 anos: " + menos);

        for (int i = 0; i < n; i++) {
            if (vetor[i].idade < 16){
                System.out.println(vetor[i].nome);
            }
        }
    }
}
