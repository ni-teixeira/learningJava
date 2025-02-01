import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois numeros para soma:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int soma = num1 + num2;

        System.out.println("soma = " + soma);

        sc.close();
    }

}
