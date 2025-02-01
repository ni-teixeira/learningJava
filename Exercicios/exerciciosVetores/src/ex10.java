import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("quantidade de pessoas: ");
        int qtd = sc.nextInt();

        double [] altura = new double [qtd];
        char [] genero = new char [qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.printf("altura da %da pessoa\n", i + 1);
            altura[i] = sc.nextDouble();

            System.out.printf("genero da %da pessoa\n", i + 1);
            genero[i] = sc.next().charAt(0);

        }

        double menor = altura[0];
        double maior = altura[0];

        for (int i = 0; i < qtd; i++) {
            if (altura[i] > maior) {
                maior = altura[i];
            }
            if (altura[i] < menor) {
                menor = altura[i];
            }
        }

        int qtdH = 0;
        int qtdM = 0;
        double alturaTotal = 0;

        for (int i = 0; i < qtd; i++) {
            if (genero[i] == 'm') {
                qtdH++;
            }
            else {
                qtdM++;
                alturaTotal+=altura[i];
            }
        }

        double alturaMedia = alturaTotal / qtdM;

        System.out.printf("Menor altura = %.2f\n", menor);
        System.out.printf("Maior altura = %.2f\n", maior);
        System.out.printf("Media das alturas das mulheres = %.2f\n", alturaMedia);
        System.out.printf("Numero de homens = %d\n", qtdH);

        sc.close();
    }

}