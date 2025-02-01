import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, hour;
        double value;

        System.out.println("Digite o seu numero:");
        num = sc.nextInt();

        System.out.println("Digite suas horas trabalhadas:");
        hour = sc.nextInt();

        System.out.println("Digite o valor que recebe por hora:");
        value = sc.nextDouble();

        double salary = value * hour;

        System.out.printf("Number: %d %n Salary: R$%.2f", num, salary);

        sc.close();

    }
}