import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("SENHA:");
        int senha = sc.nextInt();

        while (senha != 2004){
            System.out.println("SENHA INVALIDA");
            senha = sc.nextInt();
        }

        System.out.println("SENHA VALIDA");

        sc.close();
    }

}