import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", i, segundo, terceiro);
        }

        sc.close();
    }
}
