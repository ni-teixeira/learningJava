import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double raio;

        System.out.println("Digite o valor do raio de um circulo:");
        raio = sc.nextDouble();

        double area = 3.14 * raio * raio;

        System.out.println("Area:" + area);

        sc.close();

    }

}