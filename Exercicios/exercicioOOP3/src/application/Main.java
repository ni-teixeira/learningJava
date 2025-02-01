package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student std = new Student();

        System.out.println("nome:");
        std.nome = sc.nextLine();
        System.out.println("primeira nota:");
        std.n1 = sc.nextDouble();
        System.out.println("segunda nota:");
        std.n2 = sc.nextDouble();
        System.out.println("terceira nota:");
        std.n3 = sc.nextDouble();

        System.out.println("nota final: " + std.notaFinal());

        if (std.notaFinal() > 60.0){
            System.out.println("passou");
        }
        else{
            System.out.println("nao passou, faltam " + std.pontosFaltantes() + " pontos");
        }

        sc.close();

    }
}