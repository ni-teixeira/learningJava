import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // objeto para que o usuario digite
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();

        int y;
        y = sc.nextInt();

        double z;
        z = sc.nextDouble();

        char a;
        a = sc.next().charAt(0); // pega o 1 char q vc digitar

        // ler ate a quebra de linha
        String s1, s2, s3;

        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Voce digitou a palavra: " + x);
        System.out.println("Voce digitou o valor: " + y);
        System.out.println("Voce digitou o valor: " + z);
        System.out.println("Voce digitou o char: " + a);

        System.out.println(" ");

        System.out.println("Dados digitados:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close(); // fechar o programa

    }
}