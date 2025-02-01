package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("entre com a altura e a largura do retangulo: ");

        Rectangle ret = new Rectangle();

        ret.base = sc.nextDouble();
        ret.altura = sc.nextDouble();

        System.out.printf("area: %.2f%n", ret.area());
        System.out.printf("perimetro: %.2f%n", ret.perimeter());
        System.out.printf("diagonal: %.2f", ret.diagonal());

        sc.close();

    }
}