import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int code;
        double qtd;

        code = sc.nextInt();
        qtd = sc.nextDouble();

        double total;

        if(code == 1){
            total = qtd * 4.00;
        } else if (code == 2) {
            total = qtd * 4.50;
        }
        else if (code == 3){
            total = qtd * 5.00;
        }
        else if (code == 4){
            total = qtd * 2.00;
        }
        else{
            total = qtd * 1.50;
        }

        System.out.printf("Total: R$%.2f", total);

        sc.close();

    }

}
