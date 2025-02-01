import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro numero:");
        a = sc.nextInt();

        System.out.println("Digite o segundo numero:");
        b = sc.nextInt();

        int sum = a + b;

        System.out.printf("SOMA %d + %d = %d", a, b, sum);

        sc.close();

    }
}