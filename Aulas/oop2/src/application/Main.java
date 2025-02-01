package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // classe - nome do obj - setando novo objeto
        Product product = new Product(); // criando o objeto p ser usado

        System.out.println("nome do produto: ");
        product.name = sc.nextLine();
        System.out.println("valor do produto: ");
        product.price = sc.nextDouble();
        System.out.println("quantidade no estoque");
        product.qtd = sc.nextInt();

        System.out.println();
        System.out.println("dados do produto: " + product);
        System.out.println();

        System.out.println("numero de produtos a serem adicionados no estoque: ");
        int qtd = sc.nextInt();
        product.addProducts(qtd); // att da quantidade dentro do objeto product
        System.out.println();

        System.out.println("numero de produtos a serem removidos do estoque: ");
        qtd = sc.nextInt();
        product.removeProducts(qtd); // funcao remove products usando o parametro
        System.out.println();

        System.out.println("dados atualizados: " + product);

        sc.close();

    }
}