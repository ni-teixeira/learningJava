import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de casos: ");
        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {

            System.out.println("Numerador");
            int x = sc.nextInt();
            System.out.println("Denominador");
            int y = sc.nextInt();

            int div = x / y;

            if (div == 0) {
                System.out.println("Divisao impossivel");
            }
            else{
                System.out.printf("Divisao: %d%n", div);
            }
        }

        sc.close();
    }

}
