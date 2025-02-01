package application;

import entities.Client;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("enter account number: ");
        int number = sc.nextInt();

        System.out.println("enter account holder:");
        String name = sc.next();

        System.out.println("is there a initial deposit (y/n)?");
        char option = sc.next().charAt(0); // pega char da primeira posição

        // cria a var de instanciação fora para salvar os dados do if
        Client client;

        // if else para fazer a instanciação da sobrecarga dependendo dos argumentos
        if (option == 'y' || option == 'Y'){
            System.out.println("enter initial deposit value:");
            double initialDeposit = sc.nextDouble();
            client = new Client(number, name, initialDeposit); // se o usuário digitar sim chama o constructor com depósito
        }
        else{
            client = new Client(number, name); // se o usuário digita nao chama oo constructor sem depósito
        }

        System.out.println();
        System.out.println("account data:");
        System.out.println(client);

        System.out.println();
        System.out.println("enter a deposit value");
        double value = sc.nextDouble(); // criar a variable primeiro
        client.deposit(value); // depois passa como parameter

        System.out.println();
        System.out.println("updated account data:");
        System.out.println(client);

        System.out.println();
        System.out.println("enter a withdraw value:");
        value = sc.nextDouble();
        client.withdraw(value);

        System.out.println();
        System.out.println("updated account data:");
        System.out.println(client);

        sc.close();

    }
}