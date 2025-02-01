import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura do terreno: ");
        double largura = sc.nextDouble();
        System.out.println("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();
        System.out.println("Digite o valor do metro quadrado: ");
        double valor = sc.nextDouble();

        double area = comprimento * largura;
        double preco = area * valor;

        System.out.printf("Area do terreno = %.2f%nPreco do terreno = %.2f", area, preco);

        sc.close();
    }
}