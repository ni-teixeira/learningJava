import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("numeros p digita: ");
        int qtd = sc.nextInt();

        int [] vetor = new int [qtd];
        int cont = 0;

        for (int i = 0; i < qtd; i++) {
            System.out.println("digite um numero");
            vetor[i] = sc.nextInt();

            if (vetor[i] % 2 == 0){
                cont++;
            }
        }

        System.out.println("Numeros pares: ");

        for (int i = 0; i < qtd; i++) {
            if (vetor[i] % 2 == 0){
                System.out.println(vetor[i]);
            }
        }

        System.out.println("Quantidade de pares: " + cont);

        sc.close();
    }

}
