package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.println("nome:");
        emp.name = sc.nextLine();
        System.out.println("gross salary:");
        emp.grossSalary = sc.nextDouble();
        System.out.println("tax:");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println(emp);

        System.out.println();
        System.out.println("Which percentage to increase salary: ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage); // passando parametro p incrementar no salario

        System.out.println();
        System.out.println("updated data: " + emp);

        sc.close();

    }
}