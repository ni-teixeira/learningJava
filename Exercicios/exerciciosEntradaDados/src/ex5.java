import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int code1, code2, qtd1, qtd2;
        double value1, value2, calc;

        System.out.println("Digite o codigo da primeira peca:");
        code1 = sc.nextInt();

        System.out.println("Digite a quantidade de pecas:");
        qtd1 = sc.nextInt();

        System.out.println("Digite o valor da peca:");
        value1 = sc.nextDouble();

        System.out.println();

        System.out.println("Digite o codigo da segunda peca:");
        code2 = sc.nextInt();

        System.out.println("Digite a quantidade de pecas:");
        qtd2 = sc.nextInt();

        System.out.println("Digite o valor da peca:");
        value2 = sc.nextDouble();

        calc = (qtd1 * value1) + (qtd2 * value2);

        System.out.printf("VALOR A PAGAR: R$%.2f", calc);

        sc.close();
    }
}