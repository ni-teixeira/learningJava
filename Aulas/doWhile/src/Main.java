import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char resp;

        do {

            System.out.println("Temperatura: ");
            double c = sc.nextDouble();
            double f = 9.0 / 5.0 + 32.0;

            System.out.printf("Equivalente em Fahrenheith: %.2f%n", f);

            System.out.println("Deseja repetir? (s/n)");
            resp = sc.next().charAt(0);

        } while (resp != 'n');

    }

}