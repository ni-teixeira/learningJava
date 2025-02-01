import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("qnts numeros vc quer: ");
        int qtd = sc.nextInt();
        int [] vetor = new int[qtd];

        int maior = vetor[0];
        int maiorPosicao = -1;

        for (int i = 0; i < qtd; i++) {

            System.out.println("digite um numero: ");
            vetor[i] = sc.nextInt();

            if (vetor[i] > maior) {
                maior = vetor[i];
                maiorPosicao = i + 1;
            }

        }

        System.out.println("Maior valor: " + maior);
        System.out.println("posicao do maior: " + maiorPosicao);

        sc.close();
    }

}
