import java.util.Scanner;

//Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
//salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
//de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
//duas casas decimais.

public class ex8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x;
        double imposto;

        x = sc.nextDouble();

        if (x <= 2000.00){
            imposto = 0.0;
        } else if (x <= 3000.00) {
            imposto = (x - 2000) * 0.08;
        }
        else if (x <= 4500.00){
            imposto = (x - 3000) * 0.18 + 1000.0 * 0.08;
        }
        else{
            imposto = (x - 4500) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0){
            System.out.println("Insento");
        }

        System.out.printf("Total: R$%.2f", imposto);

        sc.close();

    }
}
