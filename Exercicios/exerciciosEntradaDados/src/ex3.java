import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, d;

        System.out.println("Digite o primeiro valor:");
        a = sc.nextInt();

        System.out.println("Digite o segundo valor:");
        b = sc.nextInt();

        System.out.println("Digite o terceiro valor:");
        c = sc.nextInt();

        System.out.println("Digite o quarto valor:");
        d = sc.nextInt();

        int diff = (a * b) - (c * d);

        System.out.println("Diferenca: " + diff);

        sc.close();

    }

}