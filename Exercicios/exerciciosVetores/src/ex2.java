import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("quantos numeros vc vai digitar");
        int qtd = sc.nextInt();
        int [] vetor = new int[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.println("digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("numeros digitados: ");
        for (int i = 0; i < qtd; i++) {
            System.out.println(vetor[i]);
        }

        int soma = 0;

        for (int j = 0; j < qtd; j++) {
            soma += vetor[j];
        }
        System.out.println("soma: " + soma);

        int media = soma / qtd;

        System.out.println("media: " + media);

        sc.close();

    }

}