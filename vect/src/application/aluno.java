package application;

import entities.student;

import java.util.Scanner;

public class aluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão cadastradas? ");
        int n = sc.nextInt();
        student[] vetor = new student[n];

        for (int i = 0; i < n; i++) {
                i++;
                System.out.println("Digite o nome, 1 e 2 nota do " + i + "a aluno");
                i--;
                String name = sc.next();
                double nota1 = sc.nextInt();
                double nota2 = sc.nextDouble();
                vetor[i] = new student (name, nota1, nota2);
        }
        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < n; i++) {
            vetor[i].aprovado();
        }
    }
}
