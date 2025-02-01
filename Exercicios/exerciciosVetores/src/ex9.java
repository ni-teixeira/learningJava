import java.util.Scanner;

public class ex9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("qtd de alunos: ");
        int qtd = sc.nextInt();

        String [] nome = new String [qtd];
        double[] nota1 = new double [qtd];
        double [] nota2 = new double [qtd];

        double media = 0;
        double soma = 0;

        for (int i = 0; i < qtd; i++) {
            System.out.println("digite nome, primeira e segunda nota do aluno");
            nome[i] = sc.next();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();

            soma = nota1[i] + nota2[i];

        }

        media = soma / 2;

        for (int i = 0; i < qtd; i++) {
            if (media >= 6.0) {
                System.out.println("Alunos aprovados:");
                System.out.println(nome[i]);
            }
        }

        sc.close();
    }
}
