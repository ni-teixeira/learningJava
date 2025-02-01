import java.io.SyncFailedException;
import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Preco unitario");
        double preco = sc.nextDouble();
        System.out.println("Quantidade");
        int qtd = sc.nextInt();
        System.out.println("Dinheiro recebido");
        double recebido = sc.nextDouble();

        double troco = (recebido - (preco * qtd));

        System.out.println("troco = " + troco);

        sc.close();
    }


}
