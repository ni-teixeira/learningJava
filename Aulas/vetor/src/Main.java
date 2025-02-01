import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Quantos numeros?");
        n = sc.nextInt();

        // tipo do vetor / nome / recebe um novo dado / de onde vem
        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("digite um numero");

            // vetor na posicao i vai receber o dado do scanner
            vetor[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.println("numeros digitados: ");

        for (int i = 0; i < n; i++) {
            System.out.println(vetor[i]);
        }

        sc.close();

    }
}