package application;

import utils.currencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double dolar, qtd;

        System.out.println("preco do dolar");
        dolar = sc.nextDouble();
        System.out.println("quanto ira comprar");
        qtd = sc.nextDouble();

        double total = currencyConverter.dolarReal(dolar, qtd);

        System.out.println("valor a ser pago em reais: " + total);

        sc.close();

    }
}