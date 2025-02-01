package application;

import entities.Rent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("quantos estudantes serao alocados?");

        int n = sc.nextInt();

        Rent [] vetor = new Rent[10];

        for (int i = 1; i <= n; i++) {
            System.out.println("quarto " + i);
            System.out.println("nome do estudante:");
            String nome = sc.next();
            System.out.println("email do estudante:");
            String email = sc.next();
            System.out.println("quarto do estudante:");
            int quarto = sc.nextInt();

            vetor[quarto] = new Rent(nome, email);
        }

        for (int i = 0; i < 10; i++) {
            if (vetor[i] != null) {
                System.out.println(vetor[i]); // ta apontando o endereco da memoria so
            }
        }

        sc.close();

    }
}