import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o primeiro numero: ");
        int num2 = sc.nextInt();

        while (num1 != num2){
            if (num1 < num2) {
                System.out.println("crescente");
            }
            else {
                System.out.println("decrescente");
            }
            System.out.println("digite outros numeros: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }

        sc.close();

    }
}