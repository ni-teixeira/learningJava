import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome da primeira pessoa:");
        String nome1 = sc.next();
        System.out.println("Idade da primeira pessoa:");
        int idade1 = sc.nextInt();

        System.out.println("Nome da segunda pessoa:");
        String nome2 = sc.next();
        System.out.println("Idade da segunda pessoa:");
        int idade2 = sc.nextInt();

        double media = (idade1 + idade2) / 2.0;

        System.out.printf("A media de idade de %s e %s é de %.1f anos", nome1, nome2, media);

        sc.close();
    }
}
