import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("quantas pessoas vc vai digitar: ");
        int qtd = sc.nextInt();

        String [] nome = new String[qtd];
        int [] idade = new int [qtd];

        int maior = 0;
        int posicao = -1;

        for (int i = 0; i < qtd; i++) {
            System.out.println("nome");
            nome[i] = sc.next();

            System.out.println("idade: ");
            idade[i] = sc.nextInt();

            if (idade[i] > maior) {
                maior = idade[i];
                posicao = i;
            }
        }

        System.out.println("pessoa mais velha: " + nome[posicao]);

        sc.close();
    }

}