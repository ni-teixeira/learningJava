import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c, tri, circ, trap, quad, ret;

        System.out.println("Digite o primeiro numero:");
        a = sc.nextDouble();

        System.out.println("Digite o segundo numero:");
        b = sc.nextDouble();

        System.out.println("Digite o terceiro numero:");
        c = sc.nextDouble();

        tri = (a * c) / 2.0;
        circ = 3.14159 * (c * c);
        trap = ((a + b) / 2.0) * c;
        quad = (b * b);
        ret = (a * b);

        System.out.printf("Triangulo: %.2f%n Circulo: %.2f%n Trapezio: %.2f%n Quadrado: %.2f%n Retangulo: %.2f", tri, circ, trap, quad, ret);

        sc.close();

    }

}