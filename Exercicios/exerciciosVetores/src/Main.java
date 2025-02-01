import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("quantos numeros vc vai digitar");
        int qtd = sc.nextInt();
        int [] numeros = new int[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.println("digite um numero: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] < 0){
                System.out.println("Numeros negativos");
                System.out.println(numeros[i]);
            }
        }

        sc.close();

    }
}