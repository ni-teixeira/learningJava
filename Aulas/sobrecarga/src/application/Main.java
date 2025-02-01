package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        // tira essa parte pq (pela sobrecarga) eu estou informando q a quantidade em estoque inicial sera zero
        // System.out.print("Quantity in stock: ");
        // int quantity = sc.nextInt();

        Product product = new Product(name, price); //, quantity); // tirando o quantity para nao passar esse parametro pela sobrecarga
        // a instancia eh declarada depois que os valores sao informados
        // construtor garante que os dados sejam fornecidos

        // sobrecarga = mais d uma versao da mesma operacao, a diferenca entre elas sao os valores q sao passados

        System.out.println();

        System.out.println("Product data: "+ product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();

        System.out.println("Updated data: "+ product);
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: "+ product);

        sc.close();
    }
}