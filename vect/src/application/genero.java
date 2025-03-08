package application;

import entities.gender;

import java.util.Scanner;

public class genero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maior = 0, menor = 0, media = 0, nMulher = 0, nHomens = 0;

        System.out.print("Quantas pessoas serão cadastradas? ");
        int n = sc.nextInt();
        gender[] vetor = new gender[n];

        for (int i = 0; i < n; i++) {
            i++;
            System.out.println("Dados da " + i + "a pessoa");
            i--;
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            System.out.print("Genero: ");
            char gender = sc.next().charAt(0);
            vetor[i] = new gender (height, gender);
        }

        maior = vetor[0].altura;
        menor = vetor[0].altura;

        for (int i = 1; i < n; i++) {
            if (maior < vetor[i].altura) {
                maior = vetor[i].altura;
            }
            if (menor > vetor[i].altura) {
                menor = vetor[i].altura;
            }
            if (vetor[i].genero == 'F') {
                media = media + vetor[i].altura;
                nMulher++;
            } else {
                nHomens++;
            }
        }
        System.out.println("Maior altura: " + maior);
        System.out.println("Menor altura: " + menor);
        media = media / nMulher;
        System.out.println("Média de alturas entre mulheres: " + media);
        System.out.println("Número de homens: " + nHomens);
    }
}
