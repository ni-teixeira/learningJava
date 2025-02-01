import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("numeros em cada vetor");
        int qtd = sc.nextInt();

        int [] vetor1 = new int[qtd];
        int [] vetor2 = new int[qtd];

        System.out.println("digite os valores do primeiro vetor");
        for (int i = 0; i < qtd; i++) {
            vetor1[i] = sc.nextInt();
        }

        System.out.println("digite os valores do segundo vetor");
        for (int i = 0; i < qtd; i++) {
            vetor2[i] = sc.nextInt();
        }

        int soma = 0;

        System.out.println("vetor resultante:");
        for (int i = 0; i < qtd; i++) {
            soma = vetor1[i] + vetor2[i];
            System.out.println(soma);
        }

        sc.close();
    }

}
