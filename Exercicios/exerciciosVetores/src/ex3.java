import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("qtd de pessoas: ");
        int qtd = sc.nextInt();

        String [] vetorNome = new String [qtd];
        int [] vetorIdade = new int[qtd];
        double [] vetorAltura = new double[qtd];

        double soma = 0;
        double porcentagem = 0;
        double media = 0;

        for (int i = 0; i < qtd; i++) {
            System.out.printf("Dados da %d pessoa %n", i+1);

            System.out.println("Nome:");
            vetorNome[i] = sc.next();

            System.out.println("Idade:");
            vetorIdade[i] = sc.nextInt();

            System.out.println("Altura:");
            vetorAltura[i] = sc.nextDouble();

            soma += vetorAltura[i];

        }

        media = soma / qtd;

        System.out.println("Media das alturas: " + media);

        int cont = 0;

        for (int i = 0; i < qtd; i++) {

            if (vetorIdade[i] <= 16){
                cont++;
            }

        }

        porcentagem = (cont * 100) / qtd;
        System.out.printf("pessoas com menos de 16: %.2f%n", porcentagem);

        for (int i = 0; i < qtd; i++) {

            if (vetorIdade[i] <= 16){

                System.out.println(vetorNome[i]);

            }

        }

        sc.close();
    }
}
