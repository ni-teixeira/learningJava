import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio;
        int fim;

        inicio = sc.nextInt();
        fim = sc.nextInt();

        int duracao;

        if (inicio < fim) {
            duracao = fim - inicio;
        }
        else {
            duracao = 24 - inicio + fim;
        }

        System.out.println("O jogo durou " + duracao + " horas");

        sc.close();

    }
}
