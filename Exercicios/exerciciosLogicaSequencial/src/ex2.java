import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Base do retangulo: ");
        double base = sc.nextDouble();

        System.out.println("Altura do retangulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);
        double diagonal = Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));

        System.out.printf("Area = %.2f%nPerimetro = %.2f%nDiagnonal = %.2f%n", area, perimetro, diagonal);

        sc.close();
    }

}