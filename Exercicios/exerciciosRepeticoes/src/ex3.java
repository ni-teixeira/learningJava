import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("valor para tabuada: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = num*i;
            System.out.printf("%d x %d = %d%n", num, i, result);
        }

        sc.close();
    }
}
