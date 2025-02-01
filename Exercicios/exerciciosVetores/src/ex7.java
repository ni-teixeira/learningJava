import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("qtd de elementos do vetor");
        int qtd = sc.nextInt();

        int [] vetor = new int [qtd];
        double soma = 0;
        double media = 0;

        for (int i = 0; i < qtd; i++) {
            System.out.println("digite um numero: ");
            vetor[i] = sc.nextInt();

            if (vetor[i] % 2 == 0){
                soma+=vetor[i];
            }

        }

            media = soma / qtd;

        if (soma == 0) {
            System.out.println("nenhum numero par");
        }
        else {
            System.out.println("media dos pares: " + media);
        }


        sc.close();
    }

}