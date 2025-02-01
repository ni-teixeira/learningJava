package course;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

        sc.close();

    }

    // criando a funcao max para retornar qual numero eh o maior
    // static eh qnd nao tem um objeto
    public static int max(int x, int y, int z) {

        int aux;

        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;

    }

    // void eh qnd o retorno da funcao eh vazio
    public static void showResult(int value) {

        System.out.println("Higher = " + value);

    }

}